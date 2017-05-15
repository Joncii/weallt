package com.weallt.service.security.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.dal.security.domain.UserEntity;
import com.weallt.dal.security.repository.UserRepository;
import com.weallt.service.security.domain.RegistrationEntry;
import com.weallt.service.security.domain.User;
import com.weallt.service.security.exception.EmailNotExistsException;
import com.weallt.service.security.transformer.RegistrationTransformer;


@Component
public class DefaultUserDao implements UserDao {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RegistrationTransformer registrationTransformer;
    
    public void register(RegistrationEntry entry){
        userRepository.save(registrationTransformer.transform(entry));
    }
    
    public boolean containsEmail(String email){
        List<UserEntity> users = userRepository.findByEmailLike(email);
        if(users.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public User getByEmail(String email) {
       UserEntity userEntity = userRepository.findByEmail(email);
       if(userEntity == null){
           throw new EmailNotExistsException();
       }
       return registrationTransformer.transform(userEntity);
    }

}
