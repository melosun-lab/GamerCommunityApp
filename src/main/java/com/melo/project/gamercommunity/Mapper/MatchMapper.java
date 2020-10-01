package com.melo.project.gamercommunity.Mapper;

import com.melo.project.gamercommunity.Match.Match;
import com.melo.project.gamercommunity.Match.MatchDto;

public class MatchMapper {

    public static Match from(MatchDto matchDto){
        return Match.builder()
                .fromUserId(matchDto.getFromUserId())
                .toUserId(matchDto.getToUserId())
                .likeRate(matchDto.getLikeRate())
                .build();
    }

    public static MatchDto from(Match match){
        return MatchDto.builder()
                .fromUserId(match.getFromUserId())
                .toUserId(match.getToUserId())
                .likeRate(match.getLikeRate())
                .build();
    }


}
