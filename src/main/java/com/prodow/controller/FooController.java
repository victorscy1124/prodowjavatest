package com.prodow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prodow.model.Foo;
import com.prodow.service.FooService;

@Controller
public class FooController {
	
	@Autowired
	private FooService fooService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String foo() {
		return "index";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute Foo foo, Model model) {
		fooService.save(foo);
		model.addAttribute("render", fooService.findAll());
		return "result";
	}

}
