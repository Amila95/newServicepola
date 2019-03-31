package com.servicepola.version_2.controllers;

import com.servicepola.version_2.payLoad.RegisterRequest;
import com.servicepola.version_2.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RegisterController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public Boolean registerUser(@RequestBody RegisterRequest registerRequest){
        return registrationService.registerUser(registerRequest);

    }
}
