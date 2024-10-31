package com.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Player;
import com.quiz.services.PlayerService;


@RestController
@RequestMapping("/players")
public class PlayerController {
	
	@Autowired
	public PlayerService playerService;
	
	@GetMapping()
	public List<Player> getPlayers() {
		return playerService.getPlayers();
	}
	
	@GetMapping("/{playerName}")
	public List<Player> getPlayersByPlayerName(@PathVariable String playerName) {
		return playerService.getPlayersByName(playerName);
	}
	
	@GetMapping("/random")
	public Player getRandomPlayer() {
		return playerService.getRandomPlayer();
	}
	
	@GetMapping("/random/{league}")
	public Player getRandomPlayerByLeague(@PathVariable String league) {
		return playerService.getRandomPlayerByLeague(league);
	}
	
    @PostMapping("/start")
    public String startGame() {
        playerService.startGame(); // Avvia una nuova sessione di gioco
        return "Nuova sessione di gioco iniziata!";
    }

    @PostMapping("/guess")
    public String guessPlayer(@RequestParam int idPlayerGuess) {
        return playerService.makeGuess(idPlayerGuess); // Gestisci la guess dell'utente
    }

}
