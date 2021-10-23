package com.example.demo.setup;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;

public class CricketTeamFactory{
	int id;
	List<Batsman> battingTeam=new ArrayList<Batsman>();
	List<Bowler> bowlerTeam=new ArrayList<Bowler>();

	public Bowler getBowler(BowlerType bowlerType) {
		return new Bowler(id++,bowlerType);
	}

	public Batsman addToTeamAndgetBatsman(BatsmanType type) {
		switch (type) {
		case Hitter:
			return addBatsmanToTeam(new Batsman(new int[] { 0, 1, 2, 3 }, id++,type));
		case Defensive:
			return addBatsmanToTeam(new Batsman(new int[] { 0, 1, 2, 3 }, id++,type));
		default:
			return addBatsmanToTeam(new Batsman(new int[] { 0, 1, 2, 3, 4, 5 }, id++,type);
		}
	}
	
	public List<Batsman> getBattingTeam(){
		return battingTeam;
	}
	
	public List<Bowler> getBowlerTeam(){
		return bowlerTeam;
	}
	
	public Batsman addBatsmanToTeam(Batsman newBatsman) {
		battingTeam.add(id, newBatsman);
		return newBatsman;
	}
	
	public void addBowlerToTeam() {
		
	}
}
