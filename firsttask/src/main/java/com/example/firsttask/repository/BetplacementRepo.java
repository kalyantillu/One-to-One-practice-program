package com.example.firsttask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firsttask.entity.Betplacement;

public interface BetplacementRepo extends JpaRepository<Betplacement, Integer> {

}
