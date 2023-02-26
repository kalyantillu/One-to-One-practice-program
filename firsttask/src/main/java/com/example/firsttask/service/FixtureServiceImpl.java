package com.example.firsttask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.firsttask.entity.Fixture;
import com.example.firsttask.repository.FixtureRepo;

public class FixtureServiceImpl implements FixtureService {

	@Autowired
	private FixtureRepo fixtureRepo;
	
	public Fixture createfixture(Fixture fixture)
	{
		return fixtureRepo.save(fixture);
	}
	
	public List<Fixture> getAllFixtures()
	{
		return fixtureRepo.findAll();
	}
}
