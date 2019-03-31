package com.servicepola.version_2.models;


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
public class ProviderTalent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "s_t_id")
    private SubTalent subTalent;

    private String description;

    @ManyToOne
    @JoinColumn(name = "s_p_id")
    private ServiceProvider serviceProvider;


}
