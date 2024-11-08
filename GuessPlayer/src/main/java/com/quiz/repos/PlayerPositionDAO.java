package com.quiz.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.Player;
import com.quiz.entities.PlayerPosition;
import com.quiz.entities.PlayerPositionId;

public interface PlayerPositionDAO extends JpaRepository<PlayerPosition, PlayerPositionId> {

	List<PlayerPosition> findByIdPlayerPosition_IdPlayer(Player player);
	
}
