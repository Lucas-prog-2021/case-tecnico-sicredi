package com.casetecnico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casetecnico.dto.VotingResultResponseDto;
import com.casetecnico.kafka.Producer;

@Service
public class MessagingServiceImpl implements MessagingService {

    private final Producer producer;

    @Autowired
    public MessagingServiceImpl(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void send(VotingResultResponseDto votingResult) {
        producer.send(String.format("Agenda '%s' closed! Votes: [Yes= %d] ~ [No= %d]",
                votingResult.getVoteCount().getYes(),
                votingResult.getVoteCount().getNo()
        ));
    }
}
