package com.melo.project.gamercommunity.Hobby;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Hobby {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private String name;
}
