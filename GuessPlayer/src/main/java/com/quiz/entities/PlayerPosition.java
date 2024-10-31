package com.quiz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Player_Position") //Fa riferimento alla tabella di associazione tra Player e Position League nel DB
public class PlayerPosition 
{
	@Id
	@JoinColumn(name = "id_player") //Foreign key collegata alla primary key della tabella Player
	private int player;
	
	@JoinColumn(name = "id_position") //Foreign key collegata alla primary key della tabella Position
	private int position;
    
	@Column(name = "is_main")
	private boolean isMain;

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	
}
