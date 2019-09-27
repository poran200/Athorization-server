package com.seu.athorization.repository;

import com.seu.athorization.model.LoginToken;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginTokenRepository extends MongoRepository<LoginToken, String> {
}
