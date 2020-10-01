package com.melo.project.gamercommunity.Browse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class AreaFilterDto {

    private Long id;

    private String country;

    private String state;

    private String gender;

    private String city;
}
