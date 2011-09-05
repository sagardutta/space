package com.space.repository.mongo;

import com.space.domain.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends MongoRepository<User, ObjectId> {
    public User findByUsername(String username);
}
