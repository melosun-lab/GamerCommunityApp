package com.melo.project.gamercommunity.Hobby;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class HobbyDto {
    private Long id;

    private Long userId;

    private String name;
}
