package com.quiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Player;
import com.quiz.repos.PlayerDAO;

@Service
public class PlayerService {
	
	@Autowired
	public PlayerDAO playerDAO;
	
	public List<Player> getPlayers() {
		return playerDAO.findAll();
	}
	
	public List<Player> getPlayersByName(String playerName) {
		return playerDAO.findPlayersByPlayerName(playerName);
	}

}
