package com.example.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.proxy.NameProxy;


@RestController
@RequestMapping("/rest")
public class NameController {
	
	@Autowired
	NameProxy nameProxy;
	
	@GetMapping("/name/{name}")
	public String getName(@PathVariable String name) {
		return nameProxy.getName(name);
	}

}
