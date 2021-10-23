package com.example.demo;

import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;
import com.example.demo.service.Cricket;
import com.example.demo.setup.CricketTeamFactory;

public class DemoApplication {

	public static void main(String[] args) {
		CricketTeamFactory cricketTeam = new CricketTeamFactory();
		Batsman batsman = cricketTeam.addToTeamAndgetBatsman(BatsmanType.Normal);
		Bowler bowler = cricketTeam.getBowler(BowlerType.PartTime);
		int target = 4;
		int noOfOvers = 2;
		Cricket cricket = new Cricket();
		System.out.println("Target:"+target);
		if (cricket.didBatsmanWin(noOfOvers, target, batsman, bowler))
			System.out.println("Batsman has won");
		else
			System.out.println("Batsman has lost");

		
		//2 Batsman in a team
		cricket.didBattingTeamWin(noOfOvers, target, cricketTeam.getBattingTeam());
		
	}

}
