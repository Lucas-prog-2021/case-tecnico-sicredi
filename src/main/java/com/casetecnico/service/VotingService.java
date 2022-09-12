package com.casetecnico.service;

import java.util.List;

import com.casetecnico.dto.*;

public interface VotingService {
    List<VotingResponseDto> listVotings();
    VotingResponseDto getVoting(String id);
    VotingResponseDto createVoting(VotingRequestDto dto);
    VoteResponseDto addVote(VoteRequestDto dto);
    VotingResultResponseDto getVotingResult(String id);
}
