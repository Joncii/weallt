package com.weallt.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weallt.service.security.dao.DefaultUserDao;
import com.weallt.service.security.domain.RegistrationEntry;
import com.weallt.service.security.domain.User;
import com.weallt.service.security.exception.EmailAlreadyRegisteredException;


@Service
public class RegistrationService {
    
    @Autowired
    private DefaultUserDao userDao;
    
    public void register(RegistrationEntry entry){
        if(userDao.containsEmail(entry.getEmail())){
           throw new EmailAlreadyRegisteredException();
        }
        userDao.register(entry);
    }
    
    public User findUserByEmail(String email){
        return userDao.getByEmail(email);
    }

}
