package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Team")
public class Team     //Entità Team
{
   private int id_team; //Primary key della tabella Team
   
   private String team_name;
   
   @JoinColumn(name = "id_league")  //Foreign key collegata alla primary key della tabella League
   private int league;

public int getId_team() {
	return id_team;
}

public void setId_team(int id_team) {
	this.id_team = id_team;
}

public String getTeam_name() {
	return team_name;
}

public void setTeam_name(String team_name) {
	this.team_name = team_name;
}

public int getLeague() {
	return league;
}

public void setLeague(int league) {
	this.league = league;
}
}
