package com.example.demo;

import com.example.demo.model.Batsman;

public class TestSpecialPlayer extends Batsman{

	public TestSpecialPlayer(String type, Integer[] possibleScore) {
		super(type, possibleScore);
	}
	
	@Override
	public int getNextNum() {
		return 2;
	}
}
