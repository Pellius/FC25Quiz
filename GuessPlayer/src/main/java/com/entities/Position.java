package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Position")
public class Position     //Entità Position
{
   private int id_position; //Primary key della tabella Position
   
   private String position_name;

public int getId_position() {
	return id_position;
}

public void setId_position(int id_position) {
	this.id_position = id_position;
}

public String getPosition_name() {
	return position_name;
}

public void setPosition_name(String position_name) {
	this.position_name = position_name;
}
}
