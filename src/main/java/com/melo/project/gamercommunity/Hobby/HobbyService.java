package com.melo.project.gamercommunity.Hobby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
public class HobbyService {
    @Autowired
    HobbyRepository hobbyRepository;

    public void addHobby(HobbyDto hobbyDto){
        Hobby hobby = new Hobby();
        hobby.setUserId(hobbyDto.getUserId());
        hobby.setName(hobbyDto.getName());

        hobbyRepository.save(hobby);
    }

    public List<HobbyDto> getAllHobby(Long userId){
        List<Hobby> hobbyList = hobbyRepository.getAllByUserId(userId);

        List<HobbyDto> hobbyDtosList = new ArrayList<>();

        for(Hobby hobby : hobbyList){
            HobbyDto hobbyDto = new HobbyDto();
            hobbyDto.setId(hobby.getId());
            hobbyDto.setName(hobby.getName());
            hobbyDto.setUserId(hobby.getUserId());
            hobbyDtosList.add(hobbyDto);
        }
        return hobbyDtosList;
    }

    public void deleteHobby(@Valid Hobby hobbyDto){
        Hobby hobby = new Hobby();
        hobby.setId(hobbyDto.getId());
        hobby.setUserId(hobbyDto.getUserId());
        hobby.setName(hobbyDto.getName());

        hobbyRepository.delete(hobby);
    }
}
