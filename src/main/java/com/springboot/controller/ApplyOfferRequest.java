package com.springboot.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApplyOfferRequest {
	private int cart_value;
	private int restaurant_id;
    private int user_id;
    
    public ApplyOfferRequest() {
	}
    
	public ApplyOfferRequest(int cart_value, int restaurant_id, int user_id) {
		super();
		this.cart_value = cart_value;
		this.restaurant_id = restaurant_id;
		this.user_id = user_id;
	}
	
	@JsonProperty("cart_value")
    public int getCart_value() {
		return cart_value;
	}

	@JsonProperty("restaurant_id")
	public int getRestaurant_id() {
		return restaurant_id;
	}

	@JsonProperty("user_id")
	public int getUser_id() {
		return user_id;
	}
	
}
