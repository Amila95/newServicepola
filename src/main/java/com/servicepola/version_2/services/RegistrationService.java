package com.servicepola.version_2.services;

import com.servicepola.version_2.payLoad.RegisterRequest;

public interface RegistrationService {

    public Boolean registerUser(RegisterRequest registerRequest);
}
