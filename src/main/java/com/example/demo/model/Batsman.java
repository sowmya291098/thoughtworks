package com.example.demo.model;

public class Batsman extends CricketPlayer {

	BatsmanType batsmanType;
	int[] possibleRuns;

	public Batsman(int[] runs, int id, BatsmanType batsmanType) {
		super(id);
		this.possibleRuns = runs;
		this.batsmanType=batsmanType;
	}

	@Override
	public int getNextNum() {
		int choice = scoregen.nextInt(possibleRuns.length);
		return possibleRuns[choice];
	}
	
	public BatsmanType getBatsmanType() {
		return batsmanType;
	}

}
