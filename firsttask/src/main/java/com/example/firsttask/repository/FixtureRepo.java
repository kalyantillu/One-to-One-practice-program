package com.example.firsttask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.firsttask.entity.Fixture;

@Repository
public interface FixtureRepo extends JpaRepository<Fixture, Integer> {

	
	@Query(value = "SELECT matchid FROM Fixture s where s.match_id = :matchid"
			, nativeQuery = true)
	public int getmatchid(@Param("matchid") int matchid);
}
