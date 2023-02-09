package com.bolsadeideas.springboot.di.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocaleController {
	
	@GetMapping("/locale")
	public String locale(HttpServletRequest resquest) {
		
		String ultimaUrl = resquest.getHeader("referer");
		return "redirect:".concat(ultimaUrl);
	}

}
