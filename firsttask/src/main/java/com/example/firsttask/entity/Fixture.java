package com.example.firsttask.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fixture {

	@Id
	private int matchId;
	private Date date;
	private String matchName;
	private double homeOdds;
	private double drawOdds;
	private double awayOdds;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public double getHomeOdds() {
		return homeOdds;
	}
	public void setHomeOdds(double homeOdds) {
		this.homeOdds = homeOdds;
	}
	public double getDrawOdds() {
		return drawOdds;
	}
	public void setDrawOdds(double drawOdds) {
		this.drawOdds = drawOdds;
	}
	public double getAwayOdds() {
		return awayOdds;
	}
	public void setAwayOdds(double awayOdds) {
		this.awayOdds = awayOdds;
	}
	public Fixture(int matchId, Date date, String matchName, double homeOdds, double drawOdds, double awayOdds) {
		super();
		this.matchId = matchId;
		this.date = date;
		this.matchName = matchName;
		this.homeOdds = homeOdds;
		this.drawOdds = drawOdds;
		this.awayOdds = awayOdds;
	}
	public Fixture() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fixture [matchId=" + matchId + ", date=" + date + ", matchName=" + matchName + ", homeOdds=" + homeOdds
				+ ", drawOdds=" + drawOdds + ", awayOdds=" + awayOdds + "]";
	}
	
	
	
}
