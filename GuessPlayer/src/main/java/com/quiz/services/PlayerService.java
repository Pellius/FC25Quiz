package com.quiz.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Player;
import com.quiz.repos.PlayerDAO;

@Service
public class PlayerService {
	
	@Autowired
	public PlayerDAO playerDAO;
	
	private int idPlayerToGuess;
	private int attempts;
	private boolean gameFinished;
	
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
	
	public Player getRandomPlayer() {
		return playerDAO.findRandomPlayer();
	}
	
	public Player getRandomPlayerByLeague(String league) {
		return playerDAO.findRandomPlayerByLeague(league);
	}
	
	public void startGame() {
		Player randomPlayer = getRandomPlayer();
		idPlayerToGuess = randomPlayer.getIdPlayer();
		System.out.println(idPlayerToGuess);
		attempts = 0;
		gameFinished = false;
	}
	
	public String makeGuess(int idPlayerGuess) {
        if (gameFinished) {
            return "Il gioco è già terminato";
        }

        attempts++;

        // Verifica se l'utente ha indovinato
        if (guessPlayerId(idPlayerGuess) == idPlayerToGuess) {
            gameFinished = true;
            return "Congratulazioni! Hai indovinato correttamente.";
        }

        // Controlla se ha esaurito i tentativi
        if (attempts >= 8) {
            gameFinished = true;
            return "Game Over! Il giocatore corretto aveva ID: " + idPlayerToGuess;
        }

        return "Prova ancora! Hai " + (8 - attempts) + " tentativi rimasti.";
    }
	
    private int guessPlayerId(int idPlayerGuess) {
        // Logica per ottenere l'ID del giocatore dalla guess
        Optional<Player> player = playerDAO.findById(idPlayerGuess);
        return player != null ? player.get().getIdPlayer() : -1; // Restituisce -1 se non trovato
    }

}
