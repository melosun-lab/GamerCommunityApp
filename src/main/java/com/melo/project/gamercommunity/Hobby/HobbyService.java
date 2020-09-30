package com.melo.project.gamercommunity.Hobby;

import com.melo.project.gamercommunity.Mapper.HobbyMapper;
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
        hobbyRepository.save(HobbyMapper.from(hobbyDto));
    }

    public List<HobbyDto> getAllHobby(Long userId){
        return HobbyMapper.from(hobbyRepository.getAllByUserId(userId));
    }

    public void deleteHobby(@Valid HobbyDto hobbyDto){
        hobbyRepository.delete(HobbyMapper.from(hobbyDto));
    }
}
