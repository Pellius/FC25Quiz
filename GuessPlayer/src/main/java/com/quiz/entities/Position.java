package com.quiz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "positions")
public class Position     //Entità Position
{
	@Id
   @Column(name = "id_position") //Fa riferimento al campo nella tabella 
   private int idPosition; //Primary key della tabella Position
   
   @Column(name = "positionName")
   private String positionName;

	public int getIdPosition() {
		return idPosition;
	}
	
	public void setIdPosition(int idPosition) {
		this.idPosition = idPosition;
	}
	
	public String getPositionName() {
		return positionName;
	}
	
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

   
}
