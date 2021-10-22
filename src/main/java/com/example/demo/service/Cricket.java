package com.example.demo.service;

import com.example.demo.constants.Constants;
import com.example.demo.model.CricketPlayer;

public class Cricket {
	public Boolean didBatsmanWin(int noOfOvers, int target, CricketPlayer batsman, CricketPlayer bowler) {
		int aggScore = 0;
		for (int i = 0; i < Constants.over * noOfOvers; i++) {
			int batsmanScore = batsman.getScoresForGivenBalls(1);
			int bowlerScore = bowler.getScoresForGivenBalls(1);
			System.out.println("Batsman score " + batsmanScore + " bowlerScore " + bowlerScore);
			if (batsmanScore == bowlerScore) {
				return false;
			}
			aggScore += batsmanScore;
			if (aggScore >= target) {
				return true;
			}
		}
		return false;
	}
}
