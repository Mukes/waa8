package com.waa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by 985552 on 5/16/2017.
 */
public class Stadium {
    @Getter
    @Setter
    private int stadiumKey;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String city;
    @Getter
    @Setter
    private String state;
    @Getter
    @Setter
    private List<Match> matches;
}
