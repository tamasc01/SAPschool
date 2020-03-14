package com.elsoproject.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homepage(Model model, Locale locale) {		
		System.out.println(String.format("Request received. Language: %s, Country: %s %n", locale.getLanguage(),
				locale.getDisplayCountry()));
		return "homepage";
	}
		
	@RequestMapping("/bevezetes")
	public String bevezetes(Model model) {			
		return "bevezetes";
	}
	
	@RequestMapping("/sapbusinesssuite")
	public String sapbusinesssuite(Model model) {			
		return "sapbusinesssuite";
	}
	
	@RequestMapping("/sapmodulok")
	public String sapmodulok(Model model) {			
		return "sapmodulok";
	}
	
	@RequestMapping("/bestsapmodul")
	public String bestsapmodul(Model model) {			
		return "bestsapmodul";
	}
	
	@RequestMapping("/saptanacsado")
	public String saptanacsado(Model model) {			
		return "saptanacsado";
	}
	
	@RequestMapping("/saptanusitvany")
	public String saptanusitvany(Model model) {			
		return "saptanusitvany";
	}
	
	@RequestMapping("/saplogon")
	public String saplogon(Model model) {			
		return "saplogon";
	}
	
	@RequestMapping("/quiz")
	public String quiz(Model model) {			
		return "quiz";
	}
	
	@RequestMapping("/{title}")
	public String searchForUser(@PathVariable(value = "title") String title, Model model) throws Exception {
		if (title == null)
			throw new Exception("Nincs ilyen címmel oldalunk");		
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(HttpServletRequest rA, Exception ex, Model model) {
		model.addAttribute("errorMessage", ex.getMessage());
		return "exceptionHandler";
	}
	
	
}
