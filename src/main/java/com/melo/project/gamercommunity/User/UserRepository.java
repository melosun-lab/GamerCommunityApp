package com.melo.project.gamercommunity.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByEmail(String email);

    User findUserById(Long id);

    @Query("SELECT u FROM User u " +
            "WHERE u.id NOT IN (SELECT m.toUserId FROM Match m WHERE m.fromUserId = :userId)" +
            "AND u.id <> :userId " +
            "AND u.address.country = :country " +
            "AND u.address.city = :city " +
            "AND u.address.state = :state " +
            "AND u.gender = :gender ")
    List<User> getAllUsers(Long userId, String country, String state, String city, String gender);

}
