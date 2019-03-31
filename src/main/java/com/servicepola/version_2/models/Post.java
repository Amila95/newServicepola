package com.servicepola.version_2.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String title;

    private String description;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date publishDate;

    private Byte image;

    @ManyToOne
    @JoinColumn(name="s_p_id")
    private ServiceProvider serviceProvider;

}
