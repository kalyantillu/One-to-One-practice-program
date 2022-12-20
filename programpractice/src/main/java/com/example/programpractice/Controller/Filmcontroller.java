package com.example.programpractice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.programpractice.Entity.Film;
import com.example.programpractice.Repo.Filmrepo;

@RestController
public class Filmcontroller {
	
    @Autowired
	private Filmrepo repo1;
	@PostMapping("/postfilms")
	public ResponseEntity<Film> postdata(@RequestBody Film k)
	{
		return new ResponseEntity<>(repo1.save(k), HttpStatus.CREATED);

	}
	@GetMapping("/getfilms")
	public ResponseEntity<List<Film>> getdata()
	{
		return new ResponseEntity<>(repo1.findAll(),HttpStatus.FOUND);

	}


	@GetMapping("/getfilms/{id}")
	public ResponseEntity<Film> getsingledata(@PathVariable long id )
	{
		Optional<Film> obj = repo1.findById(id);
		if(obj.isPresent()) {
			return new ResponseEntity<>(obj.get(), HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/films/{id}")
	public ResponseEntity<Film> updatedata(@PathVariable long id, @RequestBody Film a)
	{
		Optional<Film> obj = repo1.findById(id);
		if(obj.isPresent()) {
			Film save = repo1.save(a);
		return new ResponseEntity<>(save, HttpStatus.OK);
	}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//(required = false, defaultValue = "0")

	@DeleteMapping("/films/{id}")
	public ResponseEntity<Film> deletesingledata(@PathVariable long id )
	{
		Optional<Film> obj = repo1.findById(id);
		if(obj.isPresent()) {
			repo1.deleteById(id);
			return new ResponseEntity<>( HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
		
	}


