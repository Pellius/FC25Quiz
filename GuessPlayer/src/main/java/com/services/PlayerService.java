package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entities.Player;
import com.repos.PlayerDAO;

public class PlayerService {
	
	@Autowired
	public PlayerDAO playerDAO;
	
	public List<Player> getPlayers(String name) {
		return playerDAO.findPlayersByName(name);
	}

}
