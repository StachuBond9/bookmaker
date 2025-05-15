package com.stanislawwocjik.bookmaker.domain.football;

import java.util.List;

public interface FootballDataCapture {
    List<FootballMatch> matches(Leagues league);
}
