package com.api.marvel.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.marvel.feign.controller.response.MarvelResponse;
import com.api.marvel.feign.service.impl.MarvelServiceImpl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/marvel")
public class MarvelController {

	private MarvelServiceImpl service;

	@GetMapping("/comics")
	public MarvelResponse findAll() {
		return service.findAll();
	}
}
