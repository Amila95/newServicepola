package com.servicepola.version_2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String email;

    private  String password;

    private Long type;
//
    private Long status;

    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name ="s_p_id", nullable = false)
    @JsonIgnore
    private ServiceProvider serviceProvider;



}
