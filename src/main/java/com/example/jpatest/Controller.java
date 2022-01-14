package com.example.jpatest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	
	@Autowired
	CityRepository cr;
	
	@GetMapping("/cities")
	List<City> cities(){
		return cr.findAll();
	}
}
