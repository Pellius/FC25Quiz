package com.quiz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Player;
import com.quiz.repos.PlayerDAO;

@Service
public class GameService {
	
	@Autowired
	public PlayerDAO playerDAO;
	
	private int idPlayerToGuess;
	private int attempts;
	private boolean gameFinished;
	private boolean win;
	private Player randomPlayer;
	
	public void startGame() {
		randomPlayer = playerDAO.findRandomPlayer();
		idPlayerToGuess = randomPlayer.getIdPlayer();
		System.out.println(idPlayerToGuess);
		attempts = 0;
		gameFinished = false;
	}
	
	public String makeGuess(int idPlayerGuess) {
		if (gameFinished) {
            return "La partita è già finita. Inizia una nuova partita!";
        }

        attempts++;

        // Verifica se l'utente ha indovinato
        if (guessPlayerId(idPlayerGuess) == idPlayerToGuess) {
            gameFinished = true;
            win = true;
            return "Complimenti! Hai indovinato il giocatore in " + attempts + " tentativi!";
        }

        // Controlla se ha esaurito i tentativi
        if (attempts >= 8) {
            gameFinished = true;
            win = false;
            return "Tentativi esauriti. Hai perso! Il giocatore era: " + randomPlayer.getPlayerName();
        }

        return "Tentativo sbagliato! Tentativi rimasti: " + (8 - attempts);

    }
	
    private int guessPlayerId(int idPlayerGuess) {
        // Logica per ottenere l'ID del giocatore dalla guess
        Optional<Player> player = playerDAO.findById(idPlayerGuess);
        return player.isPresent() ? player.get().getIdPlayer() : -1; // Restituisce -1 se non trovato
    }
    
    // Getters per lo stato del gioco
    public boolean isGameFinished() {
        return gameFinished;
    }

    public boolean isWin() {
        return win;
    }

    public int getAttempts() {
        return attempts;
    }
    
    public String getPlayerName() {
        return randomPlayer.getPlayerName();
    }

}
