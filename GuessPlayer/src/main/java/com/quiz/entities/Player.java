package com.quiz.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "players") 
public class Player    //Entità Player
{
	@Id
   @Column(name = "id_player")
   private int idPlayer; //Primary key della tabella Player
   
   @Column(name = "player_name")
   private String playerName;
   
   private int overall;
   
   @Column(name = "weak_foot")
   private int weakFoot;
   
   @Column(name = "skill_moves")
   private int skillMoves;
   
   private int height;
   
   private int age;
   
   private String img;
   
   @ManyToOne
   @JoinColumn(name = "id_nation") //Foreign key collegata alla primary key della tabella Nation
   private Nation nation;      
   
   @ManyToOne
   @JoinColumn(name = "id_team")  //Foreign key collegata alla primary key della tabella Team
   private Team team;
   
   @OneToMany(mappedBy = "idPlayerPosition.idPlayer")
   private List<PlayerPosition> positions;

	public int getIdPlayer() {
		return idPlayer;
	}
	
	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getOverall() {
		return overall;
	}
	
	public void setOverall(int overall) {
		this.overall = overall;
	}
	
	public int getWeakFoot() {
		return weakFoot;
	}
	
	public void setWeakFoot(int weakFoot) {
		this.weakFoot = weakFoot;
	}
	
	public int getSkillMoves() {
		return skillMoves;
	}
	
	public void setSkillMoves(int skillMoves) {
		this.skillMoves = skillMoves;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getImg() {
		return img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	public Nation getNation() {
		return nation;
	}
	
	public void setNation(Nation nation) {
		this.nation = nation;
	}
	
	public Team getTeam() {
		return team;
	}
	
	public void setTeam(Team team) {
		this.team = team;
	}
   
	public List<PlayerPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<PlayerPosition> positions) {
        this.positions = positions;
    }
   
}

