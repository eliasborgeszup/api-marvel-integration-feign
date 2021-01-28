package com.api.marvel.feign.client;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.api.marvel.feign.controller.response.ComicsResponse;

@FeignClient(name = "marvel", url = "${url.marvel}/v1/public")
public interface MarvelComicsClient {
	@GetMapping("/comics")
	public ComicsResponse getAll(@RequestParam(value = "ts") Long timeStamp,
			@RequestParam(value = "apikey") String publicKey, @RequestParam(value = "hash") String hashMD5);
}
