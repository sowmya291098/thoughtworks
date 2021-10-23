package com.example.demo.model;

import java.util.Random;

import com.example.demo.constants.Constants;

public abstract class CricketPlayer {
	int id;
	int score;
	public static Random scoregen = new Random();
	final static int over = Constants.over;

	public CricketPlayer(int id) {
		this.id=id;
	}

	public int getScoresForGivenOver(int numOfOvers) {
		score=0;
		for (int i = 0; i < over * numOfOvers; i++) {
			score += getNextNum();
		}
		return score;
	}

	public int getScoresForGivenBalls(int numOfBalls) {
		score=0;
		for (int i = 0; i < numOfBalls; i++) {
			score += getNextNum();
		}
		return score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	protected abstract int getNextNum();

}

