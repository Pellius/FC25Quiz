package com.quiz.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.entities.Player;

@Repository
public interface PlayerDAO extends JpaRepository<Player, Integer>
{
  public List<Player> findPlayersByPlayerName(String playerName);
}
