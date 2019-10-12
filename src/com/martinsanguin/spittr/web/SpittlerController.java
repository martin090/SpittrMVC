package com.martinsanguin.spittr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.martinsanguin.spittr.be.Spittle;
import com.martinsanguin.spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittlerController {
	private SpittleRepository spittleRepository;
	private static final String MAX_LONG_AS_STRING = "" + Long.MAX_VALUE;
	
	@Autowired
	public SpittlerController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Spittle> spittles(
			@RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max,
			@RequestParam(value="count", defaultValue="20") int count) 
	{
		return spittleRepository.findSpittles(max, count);
	}
	
	@RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
	public String spittle(@PathVariable long spittleId, Model model)
	{
		model.addAttribute(spittleRepository.findOne(spittleId));
		return "spittle";
	}
}
