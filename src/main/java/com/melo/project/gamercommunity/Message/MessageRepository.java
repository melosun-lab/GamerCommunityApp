package com.melo.project.gamercommunity.Message;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
    @Query("SELECT m FROM Message m " +
            "WHERE (m.fromUserId = :friendId and m.toUserId = :userId)" +
            "OR (m.fromUserId = :userId AND m.toUserId = :friendId)" +
            "ORDER BY m.dateSentTime")
    List<Message> getAllByUserIdAndFriendId(@Param("userId") Long userId, @Param("friendId") Long friendId);
}
