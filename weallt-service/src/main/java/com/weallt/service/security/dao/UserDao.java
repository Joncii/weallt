package com.weallt.service.security.dao;

import com.weallt.service.security.domain.RegistrationEntry;
import com.weallt.service.security.domain.User;

public interface UserDao {
    
    void register(RegistrationEntry entry);
    
    boolean containsEmail(String email);
    
    User getByEmail(String email);

}
