package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.CricketPlayer;
import com.example.demo.model.CricketTeam;
import com.example.demo.model.PlayerType;
import com.example.demo.model.Batsman;
import com.example.demo.service.Cricket;

@ComponentScan(basePackages="")
@SpringBootApplication
public class DemoApplication {

//	static final int over=6;

	public static void main(String[] args) {

		/*
		 * Problem 1.
		 */
//		CricketPlayer batsman=new CricketPlayer();
//		int target=12;
//		int score=batsman.getScoresForGivenOver(1);
//		if(score>=target) 
//			System.out.println("Batsman has won!!");
//		else System.out.println("Batsman has lost");

		/*
		 * Problem 2
		 */
		CricketPlayer batsman1 = CricketTeam.getBatsman(PlayerType.Defensive);
		CricketPlayer bowler = CricketTeam.getBowler();
		int target = 4;
		int noOfOvers = 2;
		Cricket cricket = new Cricket();
		if (cricket.didBatsmanWin(noOfOvers, target, batsman1, bowler))
			System.out.println("Batsman has won");
		else
			System.out.println("Batsman has lost");

	}

}
