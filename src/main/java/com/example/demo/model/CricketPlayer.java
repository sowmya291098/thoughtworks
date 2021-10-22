package com.example.demo.model;

import java.util.Random;

import com.example.demo.constants.Constants;

public class CricketPlayer {
	int score;
	public static Random scoregen = new Random();
	final static int over = Constants.over;

	public CricketPlayer() {
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

	//Override this for testing
	public int getNextNum() {
		return scoregen.nextInt(over);
	}
}

