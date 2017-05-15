package com.weallt.web.security.transformer;

import org.springframework.stereotype.Component;

import com.weallt.service.security.domain.RegistrationEntry;
import com.weallt.web.security.domain.RegistrationRequest;


@Component
public class RegistrationViewTransformer {
    
    public RegistrationEntry transform(RegistrationRequest request){
        RegistrationEntry registrationEntry = new RegistrationEntry();
        registrationEntry.setEmail(request.getEmail());
        registrationEntry.setPassword(request.getPassword());
        registrationEntry.setRepassword(request.getRepassword());
        return registrationEntry;
    }

}
