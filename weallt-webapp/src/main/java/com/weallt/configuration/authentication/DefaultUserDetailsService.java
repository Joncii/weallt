package com.weallt.configuration.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.weallt.service.security.RegistrationService;
import com.weallt.service.security.domain.User;

public class DefaultUserDetailsService implements UserDetailsService {
    
    @Autowired
    private RegistrationService service;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User userEntity = service.findUserByEmail(email);
        if(userEntity != null){
            return new MongoUserDetails(userEntity.getEmail(), userEntity.getPassword(), new String[]{});
        }
        throw new IllegalArgumentException();
    }

}
