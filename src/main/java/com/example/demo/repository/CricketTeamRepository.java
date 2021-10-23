package com.example.demo.repository;

import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;

public abstract class CricketTeamRepository {
	public abstract Bowler getBowler(BowlerType bowlerType);
	public abstract Batsman getBatsman(BatsmanType type);
}
