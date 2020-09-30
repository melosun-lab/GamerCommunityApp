package com.melo.project.gamercommunity.Hobby;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HobbyRepository extends CrudRepository<Hobby, Long> {
    List<Hobby> getAllByUserId(Long userId);

    Hobby getByUserIdAndName(Long userId, String name);
}
