package com.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferRequest {
	private int restaurant_id;
	private String offer_type;
	private int offer_value;
	private List<String> customer_segment;

	public OfferRequest(int restaurant_id, String offer_type, int offer_value, List<String> customer_segment) {
		this.restaurant_id = restaurant_id;
		this.offer_type = offer_type;
		this.offer_value = offer_value;
		this.customer_segment = customer_segment;
	}

	@JsonProperty("resteraunt_id")
	public int getRestaurant_id() {
		return restaurant_id;
	}

	@JsonProperty("offer_type")
	public String getOffer_type() {
		return offer_type;
	}

	@JsonProperty("offer_value")
	public int getOffer_value() {
		return offer_value;
	}
	
	@JsonProperty("customer_segment")
	public List<String> getCustomer_segment() {
		return customer_segment;
	}
}
