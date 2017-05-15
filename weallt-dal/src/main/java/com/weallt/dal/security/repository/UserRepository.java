package com.weallt.dal.security.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.weallt.dal.security.domain.UserEntity;


@Repository
public interface UserRepository extends MongoRepository<UserEntity, ObjectId> {
    
    UserEntity findByEmail(String email);
    
    List<UserEntity> findByEmailLike(String email);

}
