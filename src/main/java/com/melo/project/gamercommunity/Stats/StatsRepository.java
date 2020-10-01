package com.melo.project.gamercommunity.Stats;

import com.melo.project.gamercommunity.User.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StatsRepository extends CrudRepository<User, Long> {

    @Query("SELECT COUNT(u) FROM User u where u.gender = :gender")
    Long countByGender(String gender);

    @Query(nativeQuery = true, value = "SELECT u FROM User u ORDER BY u.likes DESC LIMIT 10")
    List<User> getTop10OrderByLikes();

    @Query("SELECT COUNT(u), u.address.country FROM User u GROUP BY u.address.country")
    List<Object[]> getUserByCountry();

    @Query("SELECT COUNT(h) as ary, h.name FROM Hobby h GROUP BY h.name ORDER BY ary DESC")
    List<Object[]> getUsersByHobby();
}
