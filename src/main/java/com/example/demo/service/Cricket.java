package com.example.demo.service;

import com.example.demo.constants.Constants;
import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;

public class Cricket {
	
	public Boolean didBatsmanWin(int noOfOvers, int target, Batsman batsman, Bowler bowler) {
		int aggScore = 0;
		for (int i = 0; i < Constants.over * noOfOvers; i++) {
			int batsmanScore = batsman.getScoresForGivenBalls(1);
			int bowlerScore = bowler.getScoresForGivenBalls(1);
			System.out.println("Batsman score " + batsmanScore + " bowlerScore " + bowlerScore);
			if (bowler.getBowlerType()==BowlerType.Normal && (batsmanScore == bowlerScore
					|| (batsman.getBatsmanType()==BatsmanType.TailEnder && batsmanScore%2==bowlerScore%2))) {
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
