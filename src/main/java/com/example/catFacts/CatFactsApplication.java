package com.example.catFacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.entity.CatFact;
import com.entity.CatBreed;
import com.repository.CatFactRepository;
import com.repository.BreedRepository;


import java.lang.Iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class CatFactsApplication {

	public static void main(String[] args) {
		System.out.println("gqsds");
	}


private final CatFactRepository catFactRepository;

public CatFactController(final CatFactRepository catFactRepository){
  this.catFactRepository = catFactRepository;
}
private final BreedRepository breedRepository;

public CatFactController(final BreedRepository breedRepository){
  this.breedRepository = breedRepository;
}


@GetMapping("/https://catfact.ninja/breeds")
	public ArrayList<CatBreed> getCatBreeds() {
		return this.breedRepository.findAll();
	}

@GetMapping("/https://catfact.ninja/fact")
	public CatFact getCatFact() {
		return this.CatFactRepository.findAll();
	}



}
