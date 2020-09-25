package com.melo.project.gamercommunity.Match;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatchRepository extends CrudRepository<Match, Long> {

    List<Match> getAllByFromUserId(Long fromUserId);
}
