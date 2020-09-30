package com.melo.project.gamercommunity.Hobby;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
public class HobbyDto {
    private Long id;

    private Long userId;

    private String name;
}
