package com.api.marvel.feign.controller.response;

import lombok.Getter;

@Getter
public class MarvelResponse {
	private String copyright;
	private String attributionHTML;
	
	private DataResponse data;
}
