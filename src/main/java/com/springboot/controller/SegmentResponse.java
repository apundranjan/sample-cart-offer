package com.springboot.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SegmentResponse {
	public SegmentResponse() {
	}

	private String segment;

	public SegmentResponse(String segment) {
		this.segment = segment;
	}
	
	@JsonProperty("segment")
	 public String getSegment() {
			return segment;
		}
}
