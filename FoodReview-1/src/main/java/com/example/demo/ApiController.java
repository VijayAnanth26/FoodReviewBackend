package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin
@RequestMapping("/Food")
public class ApiController {
	@Autowired
	ApiRepo Repo;
	@Autowired
	ApiService service;
	
	@GetMapping("/get")
	List <FoodReview> getList(){
		return Repo.findAll();
	}
	@PostMapping("/post")
	public FoodReview create(@RequestBody FoodReview a) {
		return Repo.save(a);
	}
	@PutMapping("/update")
	public String update(@RequestBody FoodReview a){
		return service.updateDetails(a);
	}
	@DeleteMapping("/delete/{restaurantName}")
	public String delete(@PathVariable String restaurantName) {
		return service.deletedetails(restaurantName);
	}
}
