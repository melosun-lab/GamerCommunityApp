package com.melo.project.gamercommunity.Message;

import com.melo.project.gamercommunity.Mapper.MessageMapper;
import com.melo.project.gamercommunity.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    UserService userService;

    public void sendMessage(MessageDto messageDto){
        messageRepository.save(MessageMapper.from(messageDto));
    }

    public List<MessageDto> getMessage(String email, Long friendId){
        Long userId = userService.getUserIdByEmail(email);
        List<Message> messageList = messageRepository.getAllByUserIdAndFriendId(userId, friendId);
        return MessageMapper.from(messageList);
    }
}
