package com.melo.project.gamercommunity.Browse;

import com.melo.project.gamercommunity.Match.MatchDto;
import com.melo.project.gamercommunity.User.UserDto;
import com.melo.project.gamercommunity.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/browse")
public class BrowseController {

    @Autowired
    BrowseService browseService;

    @Autowired
    UserService userService;

    @GetMapping(path = "/all")
    public List<UserDto> getAllUsers(AreaFilterDto areaFilterDto){
        return browseService.getAllUsers((areaFilterDto));
    }

    @GetMapping(path = "/grade")
    public void likeUser(@RequestBody MatchDto matchDto){
        browseService.gradeUser(matchDto);
    }

    @GetMapping(path = "/id")
    public Long getId(@RequestHeader(value = "email") String email) {
        return userService.getUserIdByEmail(email);
    }

}
