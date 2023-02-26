package com.example.firsttask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firsttask.entity.Fixture;
import com.example.firsttask.service.FixtureServiceImpl;

@RestController
public class FixtureController {

	@Autowired
	private FixtureServiceImpl fixtureServiceImpl;
	
	@PostMapping("/postfixture")
	public Fixture postFixture(@RequestBody Fixture fixture)
	{
		return fixtureServiceImpl.createfixture(fixture);
	}
	
	@GetMapping("/getfixture")
	public List<Fixture> findallFixtures()
	{
		return fixtureServiceImpl.getAllFixtures();
	}
}
