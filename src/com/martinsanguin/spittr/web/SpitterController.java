package com.martinsanguin.spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.martinsanguin.spittr.be.Spitter;
import com.martinsanguin.spittr.data.SpitterRepository;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	
	@Autowired
	SpitterRepository spitterRepository;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showRegistrationForm() {
		return "registerForm";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String processRegistration(Spitter spitter) {
		this.spitterRepository.save(spitter);
		return "redirect:/spitter/" + spitter.getUsername();
	}
	
	@RequestMapping(value="/{username}")
	public String showSpitterProfile(String username, Model model) {
		Spitter spitter = this.spitterRepository.findByUsername(username);
		model.addAttribute(spitter);
		return "profile";
	}
}
