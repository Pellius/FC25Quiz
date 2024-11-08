package com.quiz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leagues") //Fa riferimento alla tabella League nel DB
public class League 
{
	@Id
	@Column(name = "id_league")
    private int idLeague; //Primary key della tabella League
    
	@Column(name = "league_name")
    private String leagueName;
	
	@Column(name = "img_league")
	private String imgLeague;

	public int getIdLeague() {
		return idLeague;
	}

	public void setIdLeague(int idLeague) {
		this.idLeague = idLeague;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getImgLeague() {
		return imgLeague;
	}

	public void setImgLeague(String imgLeague) {
		this.imgLeague = imgLeague;
	}

}
