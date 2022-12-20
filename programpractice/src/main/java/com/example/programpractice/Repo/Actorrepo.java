package com.example.programpractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.programpractice.Entity.Actor;

public interface Actorrepo extends JpaRepository<Actor,Long>{

}
