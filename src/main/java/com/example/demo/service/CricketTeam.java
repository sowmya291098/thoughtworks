package com.example.demo.service;

import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;
import com.example.demo.repository.CricketTeamRepository;

public class CricketTeam extends CricketTeamRepository{
	static int id;

	public Bowler getBowler(BowlerType bowlerType) {
		System.out.println("Bowler arrived: "+id);
		return new Bowler(id++,bowlerType);
	}

	public Batsman getBatsman(BatsmanType type) {
		System.out.println("Batsman arrived: "+id);
		switch (type) {
		case Hitter:
			return new Batsman(new int[] { 0, 4, 6 }, id++,type);
		case Defensive:
			return new Batsman(new int[] { 0, 1, 2, 3 }, id++,type);
		default:
			return new Batsman(new int[] { 0, 1, 2, 3, 4, 5 }, id++,type);
		}
	}
}