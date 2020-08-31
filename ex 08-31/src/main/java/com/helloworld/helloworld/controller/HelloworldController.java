package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloworldController {
	
	@GetMapping
	public String Hello()
	{
		return "Minha lembrança de comunidade costuma ser com as guildas que participo nos jogos e com meus amigos de infância com quem falo até hoje! :)";
	}
	
 
}
