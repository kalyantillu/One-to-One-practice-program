package com.example.programpractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.programpractice.Entity.Film;

public interface Filmrepo extends JpaRepository<Film,Long>{

}
