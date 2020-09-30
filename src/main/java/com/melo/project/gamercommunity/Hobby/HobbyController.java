package com.melo.project.gamercommunity.Hobby;

import com.melo.project.gamercommunity.Exception.InvalidHobbyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/hobby")
public class HobbyController {

    @Autowired
    HobbyService hobbyService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addHobby(@RequestBody @Valid HobbyDto hobbyDto) throws InvalidHobbyException {
        hobbyService.addHobby(hobbyDto);
    }

    @GetMapping("/{userId}")
    public List<HobbyDto> getHobbyByUser(@PathVariable Long userId){
        return hobbyService.getAllHobby((userId));
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteHobby(@RequestBody @Valid HobbyDto hobbyDto){
        hobbyService.deleteHobby(hobbyDto);
    }
}
