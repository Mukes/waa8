package com.waa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by 985552 on 5/16/2017.
 */
public class Match {
    @Getter
    @Setter
    private long matchKey;
    @Getter
    @Setter
    private Date date;
    @Getter
    @Setter
    private Date startTime;
    @Getter
    @Setter
    private Stadium stadium;
    @Getter
    @Setter
    private int homeScore;
    @Getter
    @Setter
    private int visitorScore;
    @Getter
    @Setter
    private Team homeTeam;
    @Getter
    @Setter
    private Team visitorTeam;
}
