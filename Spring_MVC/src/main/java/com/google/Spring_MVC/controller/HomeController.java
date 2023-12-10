package com.google.Spring_MVC.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping("/hello")
	public String helloWorld()
	{
		return "HelloWorlds";
	}
	
	@RequestMapping("/bye")
	public String byeWorld()
	{
		return "bye";
	}
	
	@RequestMapping("/myEndpoint")
	public String returnParam(@RequestParam String name, Model model)
	{
		model.addAttribute("Name", name);
		return "myView";
	}
	
	@RequestMapping("/endpoint")
	public String returnEndpoint(@RequestParam("customName") String name, Model model)
	{
		model.addAttribute("Name", name);
		return "myView";
	}
	
	@RequestMapping("/bookPrice")
	public String returnBookandPrice(@RequestParam("book") String theBook,
									@RequestParam("price") int thePrice, Model model)
	{
		model.addAttribute("BookName", theBook);
		model.addAttribute("BookPrice", thePrice);
		
		return "BookandPrice";
	}
	
}
