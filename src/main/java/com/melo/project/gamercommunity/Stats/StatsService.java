package com.melo.project.gamercommunity.Stats;

import com.melo.project.gamercommunity.Hobby.HobbyAmountDto;
import com.melo.project.gamercommunity.Mapper.UserMapper;
import com.melo.project.gamercommunity.User.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StatsService {

    @Autowired
    StatsRepository statsRepository;

    public Map<String, Long> getGenderProportion(){
        return Stream
                .of(new Object[][] {
                    {"Male", statsRepository.countByGender("Male")},
                    {"Female", statsRepository.countByGender("Female")}})
                .collect(Collectors.toMap(data -> (String) data[0], data -> (Long) data[1]));
    }

    public List<UserDto> getUsersWithGreatestLikes() {
        return UserMapper.from(statsRepository.getTop10OrderByLikes());
    }

    public Map<String, Long> getUsersByCountry(){
        return statsRepository.getUserByCountry()
                .stream()
                .collect(Collectors.toMap(data -> (String)data[1], data -> (Long) data[0]));
    }

    List<HobbyAmountDto> getUsersByHobby() {
        return statsRepository
                .getUsersByHobby()
                .stream()
                .map(data -> HobbyAmountDto
                        .builder()
                        .name((String) data[1])
                        .amount((Long) data[0])
                        .build())
                .collect(Collectors.toList());
    }
}
