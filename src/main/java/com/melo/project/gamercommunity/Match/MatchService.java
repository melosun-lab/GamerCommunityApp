package com.melo.project.gamercommunity.Match;

import com.melo.project.gamercommunity.User.UserDto;
import com.melo.project.gamercommunity.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {
    @Autowired
    MatchRepository matchRepository;

    @Autowired
    UserService userService;

    List<UserDto> getMatches(String email){
        Long userId = userService.getUserIdByEmail(email);

        List<Match> matches = matchRepository.getAllByFromUserId(userId);

        List<UserDto> userDtos = new ArrayList<>();
        for (Match match : matches){
            userDtos.add(userService.getUserById(match.getToUserId()));
        }
        return userDtos;
    }


}
