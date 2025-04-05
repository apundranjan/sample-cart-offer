package com.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {
    private ApiResponse apiResponse;
    private String response_msg;
    public ApiResponse(String responseMsg) {
        this.response_msg = responseMsg;
    }
    public ApiResponse(ApiResponse apiResponse) {
        this.apiResponse = apiResponse;
    }

	public String getResponseMsg() {
        return response_msg;
    }

}
