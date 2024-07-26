package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.table.TableStringConverter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Alien;

@Controller
public class HomeController {
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	@RequestMapping("/Addition")
	public String addition() {
		return "Addition";
	}

	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("additionResult");
		mv.addObject("sum", i+j);
		return mv;
	}
	
	@RequestMapping("/")
	public String generateAlien() {
		return "Alien";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		List<Alien> aliens = Arrays.asList(new Alien(101,"Navin"), new Alien(102,"Aditya"));
		m.addAttribute("aliens", aliens);
		return "showAlien";
	}
	
	@PostMapping("alien")
	public String addAlien(@ModelAttribute("aliens") Alien aliens) {		
		return "showAlien";
	}
}
