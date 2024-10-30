package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Player_Position")
public class PlayerPosition 
{
	@JoinColumn(name = "id_player") //Foreign key collegata alla primary key della tabella Player
	private int player;
	
	@JoinColumn(name = "id_position") //Foreign key collegata alla primary key della tabella Position
	private int position;
    
	private boolean is_main;

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

	public boolean isIs_main() {
		return is_main;
	}

	public void setIs_main(boolean is_main) {
		this.is_main = is_main;
	}
}
