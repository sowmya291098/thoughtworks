package com.example.demo.setup;

import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;

public class CricketTeam{
	static int id;

	public static Bowler getBowler(BowlerType bowlerType) {
		return new Bowler(id++,bowlerType);
	}

	public static Batsman getBatsman(BatsmanType type) {
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
