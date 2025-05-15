package com.stanislawwocjik.bookmaker.domain.football;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballGamesService {

    private final FootballDataCapture footballDataCapture;

    public FootballGamesService(FootballDataCapture footballDataCapture) {
        this.footballDataCapture = footballDataCapture;
    }

    public List<FootballMatch> getMatches(Leagues league){
            return footballDataCapture.matches(league);
    }
}
