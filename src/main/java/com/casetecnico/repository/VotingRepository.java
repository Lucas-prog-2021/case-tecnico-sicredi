package com.casetecnico.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casetecnico.entity.Voting;

@Repository
public interface VotingRepository extends MongoRepository<Voting, ObjectId> {
}
