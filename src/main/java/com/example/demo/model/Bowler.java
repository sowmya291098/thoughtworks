package com.example.demo.model;

import com.example.demo.constants.Constants;

public class Bowler extends CricketPlayer{

	public Bowler(int id) {
		super(id);
	}

	@Override
	protected int getNextNum() {
		return scoregen.nextInt(Constants.over);
	}

}
