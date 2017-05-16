package com.waa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by 985552 on 5/16/2017.
 */
public class Team {
    @Getter
    @Setter
    private int teamKey;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String city;
    @Getter
    @Setter
    private String mascot;
    @Getter
    @Setter
    private List<Player> players;
    @Getter
    @Setter
    private Uniform homeUniform;
    @Getter
    @Setter
    private Uniform visitUniform;
    @Getter
    @Setter
    private List<Match> matchesAsHome;
    @Getter
    @Setter
    private List<Match> matchesAsVisitor;
}
