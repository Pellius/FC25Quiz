package com.quiz.services;

import java.util.ArrayList;
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
		List<Player> res = new ArrayList<>();
		List<Player> players = playerDAO.findAll();
		for (Player player : players) {
			if (player.getPlayerName().toLowerCase().contains(playerName.toLowerCase())) {
				res.add(player);
			}
		}
		return res;
	}

}
