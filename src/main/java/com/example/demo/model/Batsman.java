package com.example.demo.model;

public class Batsman extends CricketPlayer {

	int[] possibleRuns;

	public Batsman(int[] runs, int id) {
		super(id);
		this.possibleRuns = runs;
	}

	@Override
	public int getNextNum() {
		int choice = scoregen.nextInt(possibleRuns.length);
		return possibleRuns[choice];
	}

}
