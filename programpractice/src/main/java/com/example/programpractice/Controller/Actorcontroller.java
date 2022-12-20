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

import com.example.programpractice.Entity.Actor;
import com.example.programpractice.Repo.Actorrepo;


@RestController
public class Actorcontroller {

	@Autowired
	private Actorrepo repo;
   
@PostMapping("/postactors")
public ResponseEntity<Actor> postdata(@RequestBody Actor k)
{
	return new ResponseEntity<>(repo.save(k), HttpStatus.CREATED);

}
@GetMapping("/getactors")
public ResponseEntity<List<Actor>> getdata()
{
	return new ResponseEntity<>(repo.findAll(),HttpStatus.FOUND);

}

	


@GetMapping("/getactors/{id}")
public ResponseEntity<Actor> getsingledata(@PathVariable long id )
{
	Optional<Actor> obj = repo.findById(id);
	if(obj.isPresent()) {
		return new ResponseEntity<>(obj.get(), HttpStatus.FOUND);
	}
	else
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}

@PutMapping("/actors/{id}")
public ResponseEntity<Actor> updatedata(@PathVariable long id, @RequestBody Actor a)
{
	Optional<Actor> obj = repo.findById(id);
	if(obj.isPresent()) {
		Actor save = repo.save(a);
	return new ResponseEntity<>(save, HttpStatus.OK);
}
	else
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
//(required = false, defaultValue = "0")

@DeleteMapping("/actors/{id}")
public ResponseEntity<Actor> deletesingledata(@PathVariable long id )
{
	Optional<Actor> obj = repo.findById(id);
	if(obj.isPresent()) {
		repo.deleteById(id);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	else
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
	
}
