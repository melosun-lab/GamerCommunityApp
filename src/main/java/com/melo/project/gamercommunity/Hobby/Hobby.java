package com.melo.project.gamercommunity.Hobby;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
public class Hobby {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private String name;
}
