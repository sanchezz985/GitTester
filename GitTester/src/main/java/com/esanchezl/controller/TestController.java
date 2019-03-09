package com.esanchezl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/gretting")
	public String greeting()
	{
		return "Hi !";
	}
}