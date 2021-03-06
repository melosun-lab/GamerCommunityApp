package com.melo.project.gamercommunity.Match;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Builder
@AllArgsConstructor
public class Match {

    @Id
    @GeneratedValue
    private Long id;

    private Long fromUserId;

    private Long toUserId;

    private Long likeRate;

    private boolean isMatched;
}
