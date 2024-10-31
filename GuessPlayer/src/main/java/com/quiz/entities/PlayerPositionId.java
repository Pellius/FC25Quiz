package com.quiz.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PlayerPositionId implements Serializable {
	
	@ManyToOne
	@JoinColumn(name = "id_player") //Foreign key collegata alla primary key della tabella Player
	private Player idPlayer;
	
	@ManyToOne
	@JoinColumn(name = "id_position") //Foreign key collegata alla primary key della tabella Position
	private Position idPosition;

	public int getIdPlayer() {
		return idPlayer.getIdPlayer();
	}

	public void setIdPlayer(Player idPlayer) {
		this.idPlayer = idPlayer;
	}

	public int getIdPosition() {
		return idPosition.getIdPosition();
	}

	public void setIdPosition(Position idPosition) {
		this.idPosition = idPosition;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        PlayerPositionId that = (PlayerPositionId) o;
        
        return idPlayer.getIdPlayer() == that.idPlayer.getIdPlayer() && Objects.equals(idPosition.getIdPosition(), that.idPosition.getIdPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlayer.getIdPlayer(), idPosition.getIdPosition());
    }

}
