package com.quiz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "teams")
public class Team     //Entità Team
{
	@Id
   @Column(name = "id_team")
   private int idTeam; //Primary key della tabella Team
   
   @Column(name = "team_name")
   private String teamName;
   
   @ManyToOne
   @JoinColumn(name = "id_league")  //Foreign key collegata alla primary key della tabella League
   private League league;

	public int getIdTeam() {
		return idTeam;
	}
	
	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public League getLeague() {
		return league;
	}
	
	public void setLeague(League league) {
		this.league = league;
	}

   
}
