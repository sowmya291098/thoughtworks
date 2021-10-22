package com.example.demo.model;

public class CricketTeam {
	static int id;

	public static Bowler getBowler() {
		return new Bowler(id++);
	}

	public static Batsman getBatsman(PlayerType type) {
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
