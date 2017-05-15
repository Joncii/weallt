package com.weallt.service.security.transformer;

import org.springframework.stereotype.Component;

import com.weallt.dal.security.domain.UserEntity;
import com.weallt.service.security.domain.RegistrationEntry;
import com.weallt.service.security.domain.User;


@Component
public class RegistrationTransformer {

    public UserEntity transform(RegistrationEntry entry) {
        UserEntity entity = new UserEntity();
        entity.setEmail(entry.getEmail());
        entity.setPassword(entry.getPassword());
        return entity;
    }
    
    public User transform(UserEntity entity){
        User user = new User();
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }

}
