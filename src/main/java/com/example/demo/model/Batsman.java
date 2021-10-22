package com.example.demo.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Batsman extends CricketPlayer {
	String type;
	@Value("#{'${batsman}'.split(';')}")
	List<String> capableScorels;
	Map<String,String[]> capableScores=new HashMap<String,String[]>();

	private void initialize() {
		for(int i=0;i<capableScorels.size();i++)
			capableScores.put(capableScorels.get(i).split(":")[0].toString(),capableScorels.get(i).split(":")[1].split(","));
	}
	
	public Batsman(String type) {
		super();
		System.out.println(capableScorels);
		initialize();
		this.type=type;
	}

	@Override
	public int getNextNum() {
		int choice=scoregen.nextInt(capableScores.get(type).length);
		return Integer.parseInt(capableScores.get(type)[choice]);
	}

	/*
	 * Problem 3: Specific to Hitter
	 */
//	@Override
//	public int getNextNum() {
//		int choice = scoregen.nextInt(3);
//		switch (choice) {
//		case 0:
//			return 0;
//		case 1:
//			return 4;
//		default:
//			return 6;
//		}
//	}
	
}
