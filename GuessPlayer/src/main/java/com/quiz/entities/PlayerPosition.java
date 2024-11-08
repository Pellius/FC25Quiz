package com.quiz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_position") //Fa riferimento alla tabella di associazione tra Player e Position League nel DB
public class PlayerPosition 
{
	@EmbeddedId
	private PlayerPositionId idPlayerPosition;
	
    @ManyToOne
    @JoinColumn(name = "id_position", insertable = false, updatable = false)
    private Position position;
    
	@Column(name = "is_main")
	private boolean isMain;

	public PlayerPositionId getIdPlayerPosition() {
		return idPlayerPosition;
	}
	
	public String getPositionName() {
        return position != null ? position.getPositionName() : null; // Restituisce il nome della posizione
    }

	public void setIdPlayerPosition(PlayerPositionId idPlayerPosition) {
		this.idPlayerPosition = idPlayerPosition;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

}
