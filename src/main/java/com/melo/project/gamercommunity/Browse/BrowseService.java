package com.melo.project.gamercommunity.Browse;

import com.melo.project.gamercommunity.Mapper.MatchMapper;
import com.melo.project.gamercommunity.Mapper.UserMapper;
import com.melo.project.gamercommunity.Match.MatchDto;
import com.melo.project.gamercommunity.Match.MatchRepository;
import com.melo.project.gamercommunity.User.UserDto;
import com.melo.project.gamercommunity.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrowseService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MatchRepository matchRepository;

    public List<UserDto> getAllUsers(AreaFilterDto areaFilterDto) {
        return UserMapper.from(
                userRepository.getAllUsers(
                        areaFilterDto.getId(),
                        areaFilterDto.getCountry(),
                        areaFilterDto.getState(),
                        areaFilterDto.getCity(),
                        areaFilterDto.getGender()
                )
        );
    }

    public void gradeUser(MatchDto matchDto) {
        matchRepository.save(MatchMapper.from(matchDto));
    }
}
