package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "League") //Entità League
public class League 
{
    private int id_league; //Primary key della tabella League
    
    private String league_name;

	public int getId_league() {
		return id_league;
	}

	public void setId_league(int id_league) {
		this.id_league = id_league;
	}

	public String getLeague_name() {
		return league_name;
	}

	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}
}
