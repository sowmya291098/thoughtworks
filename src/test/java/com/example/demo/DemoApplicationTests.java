package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;
import com.example.demo.service.Cricket;
import com.example.demo.setup.CricketTeamFactory;

//@SpringBootTest
class DemoApplicationTests {

	Cricket cricket;
	@BeforeEach
	void setup() {
		cricket=new Cricket();
	}
	
	@Test
	void testTailEnderBatsman() {
		Batsman batsman = CricketTeamFactory.getBatsman(BatsmanType.TailEnder);
		batsman.setScore(12);
		Bowler bowler = CricketTeamFactory.getBowler(BowlerType.Normal);
		bowler.setScore(10);
		System.out.println("Test service");
		assert(!cricket.didBatsmanWin(0, 12, batsman, bowler));		
	}
	
	@Test
	void testPartTimeBowler() {
		//PartTime bowler doesnt take wickets
		Batsman batsman = CricketTeamFactory.getBatsman(BatsmanType.Normal);
		batsman.setScore(12);
		Bowler bowler = CricketTeamFactory.getBowler(BowlerType.PartTime);
		bowler.setScore(12);
		System.out.println("Test service");
		assert(!cricket.didBatsmanWin(0, 12, batsman, bowler));		
	}

}
