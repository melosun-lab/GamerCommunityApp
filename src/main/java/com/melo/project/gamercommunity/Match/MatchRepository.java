package com.melo.project.gamercommunity.Match;

import com.melo.project.gamercommunity.User.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatchRepository extends CrudRepository<Match, Long> {

    List<Match> getAllByFromUserId(Long fromUserId);
}
