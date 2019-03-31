package com.servicepola.version_2.payLoad;

import com.servicepola.version_2.models.ProviderTalent;
import com.servicepola.version_2.models.SubTalent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String name;
    private String email;
    private String address;
    private String password;
    private String town;
    private String description;
    private Integer mobileNumber;
    private List<SubTalent> talents;
    private String district;


}
