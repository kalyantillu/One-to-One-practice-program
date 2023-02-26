package com.example.firsttask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Betplacement {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String customerName;
	private int matchId;
	private String matchName;
	private Double homeOdds;
	private Double drawOdds;
	private Double awayOdds;
	private double maxOdds;
	private double minOdds;
	private double stake;
	private double totalAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public Double getHomeOdds() {
		return homeOdds;
	}
	public void setHomeOdds(Double homeOdds) {
		this.homeOdds = homeOdds;
	}
	public Double getDrawOdds() {
		return drawOdds;
	}
	public void setDrawOdds(Double drawOdds) {
		this.drawOdds = drawOdds;
	}
	public Double getAwayOdds() {
		return awayOdds;
	}
	public void setAwayOdds(Double awayOdds) {
		this.awayOdds = awayOdds;
	}
	public double getMaxOdds() {
		return maxOdds;
	}
	public void setMaxOdds(double maxOdds) {
		this.maxOdds = maxOdds;
	}
	public double getMinOdds() {
		return minOdds;
	}
	public void setMinOdds(double minOdds) {
		this.minOdds = minOdds;
	}
	public double getStake() {
		return stake;
	}
	public void setStake(double stake) {
		this.stake = stake;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Betplacement(int id, String customerName, int matchId, String matchName, Double homeOdds, Double drawOdds,
			Double awayOdds, double maxOdds, double minOdds, double stake, double totalAmount) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.matchId = matchId;
		this.matchName = matchName;
		this.homeOdds = homeOdds;
		this.drawOdds = drawOdds;
		this.awayOdds = awayOdds;
		this.maxOdds = maxOdds;
		this.minOdds = minOdds;
		this.stake = stake;
		this.totalAmount = totalAmount;
	}
	public Betplacement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Betplacement [id=" + id + ", customerName=" + customerName + ", matchId=" + matchId + ", matchName="
				+ matchName + ", homeOdds=" + homeOdds + ", drawOdds=" + drawOdds + ", awayOdds=" + awayOdds
				+ ", maxOdds=" + maxOdds + ", minOdds=" + minOdds + ", stake=" + stake + ", totalAmount=" + totalAmount
				+ "]";
	}
	
	
}
