package com.api.marvel.feign.service.impl;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.api.marvel.feign.client.MarvelComicsClient;
import com.api.marvel.feign.controller.response.ComicsResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarvelServiceImpl {
	private static final String PUBLIC_KEY = "de8ae6b7ddc90c4bbcaba79435515c1a";
	private static final String PRIVATE_KEY = "36411abdd8d7167a1f98760edadb5189be6b339d";

	private MarvelComicsClient client;

	public ComicsResponse findAll() {
		Long timeStamp = new Date().getTime();

		return client.getAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}

	private String buildHash(Long timeStamp) {
		return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
	}
}
