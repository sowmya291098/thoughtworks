package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.CricketPlayer;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;
import com.example.demo.model.Batsman;
import com.example.demo.service.Cricket;
import com.example.demo.service.CricketTeam;

//@ComponentScan(basePackages="")
//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Batsman batsman =new CricketTeam().getBatsman(BatsmanType.Defensive);
		Bowler bowler = new CricketTeam().getBowler(BowlerType.PartTime);
		int target = 4;
		int noOfOvers = 2;
		Cricket cricket = new Cricket();
		if (cricket.didBatsmanWin(noOfOvers, target, batsman, bowler))
			System.out.println("Batsman has won");
		else
			System.out.println("Batsman has lost");

	}

}
