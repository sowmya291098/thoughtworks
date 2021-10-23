package com.example.demo.service;

import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;
import com.example.demo.repository.CricketTeamRepository;

public class CricketTeam implements CricketTeamRepository{
	static int id;
	
	CricketTeam cricketTeam;
	
	public CricketTeam() {
		if(cricketTeam==null)
			cricketTeam=new CricketTeam();
	}

	public Bowler getBowler(BowlerType bowlerType) {
		System.out.println("Bowler arrived: "+id);
		return new Bowler(id++,bowlerType);
	}

	public Batsman getBatsman(BatsmanType type) {
		System.out.println("Batsman arrived: "+id);
		switch (type) {
		case Hitter:
			return new Batsman(new int[] { 0, 4, 6 }, id++);
		case Defensive:
			return new Batsman(new int[] { 0, 1, 2, 3 }, id++);
		default:
			return new Batsman(new int[] { 0, 1, 2, 3, 4, 5 }, id++);
		}
	}
}
