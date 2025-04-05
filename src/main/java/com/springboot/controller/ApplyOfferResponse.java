package com.springboot.controller;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApplyOfferResponse {

	private int cart_value;
	private int user_id;
	private int resteraunt_id;

	public ApplyOfferResponse(int cart_value, int user_id, int resteraunt_id) {
		super();
		this.cart_value = cart_value;
		this.user_id = user_id;
		this.resteraunt_id = resteraunt_id;
	}

	@JsonProperty("cart_value")
	public int getCart_value() {
		return cart_value;
	}

	@JsonProperty("user_id")
	public int getUser_id() {
		return user_id;
	}

	@JsonProperty("resteraunt_id")
	public int getRestaurant_id() {
		return resteraunt_id;
	}
}
