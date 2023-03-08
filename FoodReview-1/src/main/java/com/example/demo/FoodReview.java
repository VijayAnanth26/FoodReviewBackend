package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodReview {
	@Id
	private String restaurantName;
	private String name;
	private String foodName;
	private String review;
	private int ratings;
	public FoodReview(String name, String restaurantName, String foodName, String review, int ratings) {
		super();
		this.name = name;
		this.restaurantName = restaurantName;
		this.foodName = foodName;
		this.review = review;
		this.ratings = ratings;
	}
	public FoodReview() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
}
