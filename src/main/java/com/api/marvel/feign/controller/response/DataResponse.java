package com.api.marvel.feign.controller.response;

import java.util.List;

import lombok.Getter;

@Getter
public class DataResponse {
	private List<ResultsResponse> results;
}
