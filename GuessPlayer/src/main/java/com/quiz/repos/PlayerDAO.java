package com.quiz.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quiz.entities.Player;

@Repository
public interface PlayerDAO extends JpaRepository<Player, Integer>
{
	
    List<Player> findByOverallGreaterThanEqual(int overall);

	@Query(value = "SELECT * FROM players "
			+ "WHERE overall >= 80 "
			+ "ORDER BY RAND() LIMIT 1", nativeQuery = true)
	public Player findRandomPlayer();
		
	@Query(value = "SELECT p.* FROM players p "
            + "JOIN teams t ON p.id_team = t.id_team "
            + "JOIN leagues l ON t.id_league = l.id_league "
            + "WHERE l.league_name = :league "
            + "AND p.overall >= 80 "
            + "ORDER BY RAND() LIMIT 1", nativeQuery = true)
	public Player findRandomPlayerByLeague(@Param("league") String league);
	
}
