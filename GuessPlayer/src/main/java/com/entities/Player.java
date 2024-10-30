package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Player") 
public class Player    //Entità Player
{

   private int id_player; //Primary key della tabella Player
   
   private String player_name;
   
   private int overall;
   
   private int weak_foot;
   
   private int skill_moves;
   
   private int height;
   
   private int age;
   
   private String img;
   
   @JoinColumn(name = "id_nation") //Foreign key collegata alla primary key della tabella Nation
   private int nation;      
   
   @JoinColumn(name = "id_team")  //Foreign key collegata alla primary key della tabella Team
   private int team;

public int getId_player() {
	return id_player;
}

public void setId_player(int id_player) {
	this.id_player = id_player;
}

public String getPlayer_name() {
	return player_name;
}

public void setPlayer_name(String player_name) {
	this.player_name = player_name;
}

public int getOverall() {
	return overall;
}

public void setOverall(int overall) {
	this.overall = overall;
}

public int getWeak_foot() {
	return weak_foot;
}

public void setWeak_foot(int weak_foot) {
	this.weak_foot = weak_foot;
}

public int getSkill_moves() {
	return skill_moves;
}

public void setSkill_moves(int skill_moves) {
	this.skill_moves = skill_moves;
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

public int getNation() {
	return nation;
}

public void setNation(int nation) {
	this.nation = nation;
}

public int getTeam() {
	return team;
}

public void setTeam(int team) {
	this.team = team;
} 
   
}

