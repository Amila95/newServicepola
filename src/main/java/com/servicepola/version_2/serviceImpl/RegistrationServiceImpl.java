package com.servicepola.version_2.serviceImpl;

import com.servicepola.version_2.models.ProviderTalent;
import com.servicepola.version_2.models.ServiceProvider;
import com.servicepola.version_2.models.SubTalent;
import com.servicepola.version_2.models.User;
import com.servicepola.version_2.payLoad.RegisterRequest;
import com.servicepola.version_2.repositaries.ProviderTalentRepository;
import com.servicepola.version_2.repositaries.ServiceProviderRepositary;
import com.servicepola.version_2.repositaries.UserRepository;
import com.servicepola.version_2.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private ServiceProviderRepositary serviceProviderRepositary;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProviderTalentRepository providerTalentRepository;

    @Override
    public Boolean registerUser(RegisterRequest registerRequest) {

        ServiceProvider serviceProvider = ServiceProvider.builder().address(registerRequest.getAddress()).description(registerRequest.getDescription()).district(registerRequest.getDistrict()).mobile(registerRequest.getMobileNumber()).name(registerRequest.getName()).town(registerRequest.getTown()).build();
        serviceProviderRepositary.save(serviceProvider);

        ServiceProvider serviceProvider1 = serviceProviderRepositary.findByEmail(registerRequest.getEmail());
        User user = User.builder().email(registerRequest.getEmail()).password(registerRequest.getPassword()).status((long) 1).type((long) 2).serviceProvider(serviceProvider).build();
        userRepository.save(user);

        if(registerRequest.getTalents() != null) {
            for (SubTalent subTalent1 : registerRequest.getTalents()) {
                ProviderTalent providerTalent = ProviderTalent.builder().subTalent(subTalent1).serviceProvider(serviceProvider).build();
                providerTalentRepository.save(providerTalent);
            }
        }
        return true;
    }
}
