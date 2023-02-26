package com.example.firsttask.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.firsttask.entity.Betplacement;
import com.example.firsttask.repository.BetplacementRepo;
import com.example.firsttask.repository.FixtureRepo;

public class BetplacementServiceImpl implements BetplacementService {

	@Autowired
	private BetplacementRepo betplacementRepo;
	
	@Autowired
	private FixtureRepo fixtureRepo;
	
	public double placeBet(Betplacement betplacement)
	{
		//int matchid = betplacement.getMatchId();
		//int matchid2 = fixtureRepo.getmatchid(matchid);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		return 0;
	}
}
