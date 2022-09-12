package com.casetecnico.service;

import com.casetecnico.dto.VotingResultResponseDto;

public interface MessagingService {
    void send(VotingResultResponseDto votingResult);
}
