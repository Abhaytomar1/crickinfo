package com.crick.apis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crick.apis.entities.Match;

import java.util.Optional;

public interface MatchRepo extends JpaRepository <Match,Integer> {
    Optional<Match> findByTeamHeading(String teamHeading);

}
