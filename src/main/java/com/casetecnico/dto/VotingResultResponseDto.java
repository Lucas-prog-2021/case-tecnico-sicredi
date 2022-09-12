package com.casetecnico.dto;

import com.casetecnico.entity.VoteCount;

public class VotingResultResponseDto {
   
	private VoteCount voteCount;

    public VoteCount getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(VoteCount voteCount) {
        this.voteCount = voteCount;
    }
}
