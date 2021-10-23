package com.example.demo.model;

import com.example.demo.constants.Constants;

public class Bowler extends CricketPlayer{

	BowlerType bowlerType;
	
	public Bowler(int id,BowlerType bowlerType) {
		super(id);
		this.bowlerType=bowlerType;
	}

	@Override
	protected int getNextNum() {
		return scoregen.nextInt(Constants.over);
	}
	
	public BowlerType getBowlerType() {
		return bowlerType;
	}

}
