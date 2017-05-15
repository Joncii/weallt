package com.weallt.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weallt.web.security.domain.RegistrationRequest;
import com.weallt.web.security.facade.RegistrationViewFacade;


@RestController
public class SecurityRestController {
    
    @Autowired
    private RegistrationViewFacade registrationFacade;
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(@RequestBody RegistrationRequest request) {
        registrationFacade.register(request);
    }

}
