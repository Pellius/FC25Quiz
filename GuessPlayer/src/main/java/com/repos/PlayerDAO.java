package com.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Player;

public interface PlayerDAO extends JpaRepository<Player, Integer>
{
  public List<Player> findPlayersByName(String nome);
}
