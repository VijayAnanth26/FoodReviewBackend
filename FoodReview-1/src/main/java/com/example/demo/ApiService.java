package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
	@Autowired
	ApiRepo Repo;

	public String updateDetails(FoodReview a) {
		Repo.save(a);
		return "Updated";
	}
	public String deletedetails(String restaurantName) {
		Repo.deleteById(restaurantName);
		return "Deleted";
	}
}
