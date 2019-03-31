package com.servicepola.version_2.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String town;

    private String email;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dob;

    private String district;

    private String address;

    private Integer mobile;

    private String description;

    private Byte image;



   @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "serviceProvider")
   @JsonIgnore
   private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceProvider")
    private List<Post> postList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceProvider")
    private List<ProviderTalent> providerTalentList;

}
