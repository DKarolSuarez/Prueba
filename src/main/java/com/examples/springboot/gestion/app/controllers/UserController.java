package com.examples.springboot.gestion.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

@GetMapping("/")

public String index() {
	return "index";
}

@GetMapping("/userform")

public String userform() {
	return "user-form/user-view";
}



}

