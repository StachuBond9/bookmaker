package com.stanislawwocjik.bookmaker.domain.football;

import java.time.LocalDateTime;

public record FootballMatch(LocalDateTime startGame, String venue, FootballTeam home, FootballTeam away) {

}
