package com.space.repository.mongo;

import com.space.domain.Feedback;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface FeedbackRepository extends MongoRepository<Feedback, ObjectId> {
    public Feedback findById(ObjectId id);
}
