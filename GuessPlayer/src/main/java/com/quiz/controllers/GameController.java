package com.quiz.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.services.GameService;

@RestController
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	GameService gameService;
	
	@PostMapping("/start")
    public Map<String, String> startGame() {
        gameService.startGame();
        Map<String, String> response = new HashMap<>();
        response.put("message", "Nuova partita iniziata! Hai 8 tentativi per indovinare il giocatore.");
        return response;
    }

    @PostMapping("/guess")
    public Map<String, Object> guessPlayer(@RequestParam int idPlayerGuess) {
        String resultMessage = gameService.makeGuess(idPlayerGuess);
        
        Map<String, Object> response = new HashMap<>();
        response.put("message", resultMessage);
        response.put("attempts", gameService.getAttempts());
        response.put("gameFinished", gameService.isGameFinished());
        response.put("win", gameService.isWin());
        response.put("player", gameService.getPlayerName());

        return response;
    }

}
