package com.melo.project.gamercommunity.Match;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
public class MatchDto {

    private Long fromUserId;

    private Long toUserId;

    private Long likeRate;

    private boolean isMatched;
}
