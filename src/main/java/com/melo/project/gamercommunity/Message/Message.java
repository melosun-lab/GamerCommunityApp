package com.melo.project.gamercommunity.Message;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private Long fromUserId;

    private Long toUserId;

    private String messageContent;

    private Boolean messageSeen;

    private LocalDateTime dateSentTime;
}
