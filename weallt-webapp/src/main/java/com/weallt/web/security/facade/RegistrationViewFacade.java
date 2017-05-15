package com.weallt.web.security.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.security.RegistrationService;
import com.weallt.web.security.domain.RegistrationRequest;
import com.weallt.web.security.transformer.RegistrationViewTransformer;


@Component
public class RegistrationViewFacade {
    
    @Autowired
    private RegistrationService registrationService;
    
    @Autowired
    private RegistrationViewTransformer registrationTransformer;
    
    public void register(RegistrationRequest request){
        registrationService.register(registrationTransformer.transform(request));
    }

}
