package com.servicepola.version_2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MainTalent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @NotBlank
    private  String name;

    private String description;

}
