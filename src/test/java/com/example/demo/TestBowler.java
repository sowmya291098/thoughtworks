package com.example.demo;

import com.example.demo.model.CricketPlayer;

public class TestBowler extends CricketPlayer {
	public TestBowler() {
		super();
	}
	@Override
	public int getNextNum() {
		return 5;
	}
}