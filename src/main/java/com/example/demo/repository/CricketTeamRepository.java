package com.example.demo.repository;

import com.example.demo.model.Batsman;
import com.example.demo.model.BatsmanType;
import com.example.demo.model.Bowler;
import com.example.demo.model.BowlerType;

public interface CricketTeamRepository {
	public Bowler getBowler(BowlerType bowlerType);
	public Batsman getBatsman(BatsmanType type);
}
