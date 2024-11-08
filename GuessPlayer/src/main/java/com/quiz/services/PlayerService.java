package com.quiz.services;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Player;
import com.quiz.entities.PlayerPosition;
import com.quiz.repos.PlayerDAO;
import com.quiz.repos.PlayerPositionDAO;

@Service
public class PlayerService {
	
	@Autowired
	public PlayerDAO playerDAO;
	
	@Autowired
	public PlayerPositionDAO playerPositionDAO;
	
	public List<Player> getPlayers() {
		List<Player> players = playerDAO.findAll();
		
		players.forEach(player -> {
	        List<PlayerPosition> positions = playerPositionDAO.findByIdPlayerPosition_IdPlayer(player);
	        player.setPositions(positions);
	    });
		
		return players;
	}
	
    public List<Player> getPlayersByName(String playerName) {
        // Normalizza e rimuove gli accenti dal nome del giocatore di input
        String normalizedInput = normalizeString(playerName);
        
        // Cerca i giocatori con un overall >= 80
        List<Player> players = playerDAO.findByOverallGreaterThanEqual(80);
        
        // Filtra i giocatori il cui nome normalizzato contiene il nome cercato
        return players.stream()
                .filter(player -> normalizeString(player.getPlayerName()).contains(normalizedInput))
                .collect(Collectors.toList());
    }

    private String normalizeString(String input) {
        if (input == null) return null;
        
        // Rimuove gli accenti e converte in minuscolo
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD)
            .replaceAll("[\\p{InCombiningDiacriticalMarks}]+", "")
            .toLowerCase(Locale.ROOT);
        
        return normalized;
    }

}
