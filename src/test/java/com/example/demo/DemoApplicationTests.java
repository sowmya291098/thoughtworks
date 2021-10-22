package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.CricketPlayer;
import com.example.demo.service.Cricket;

//@SpringBootTest
class DemoApplicationTests {

	Cricket cricket;
	@BeforeEach
	void setup() {
		cricket=new Cricket();
	}
	
	@Test
	void contextLoads() {
		TestBatsman batsman=new TestBatsman();
		TestBowler bowler=new TestBowler();
		assert(batsman.getScoresForGivenBalls(3)==3);
			
		assert(cricket.didBatsmanWin(2, 2, batsman, bowler));
		//TODO
//		TestSpecialPlayer specialBatsman=new TestSpecialPlayer("Defensive",int[] {0,1,2,3});
		
	}

}
