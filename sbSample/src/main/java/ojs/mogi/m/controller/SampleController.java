package ojs.mogi.m.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ojs.mogi.m.service.SampleService;

@Controller
public class SampleController {

	@Autowired
	SampleService service;

	@RequestMapping("/index")
	public ModelAndView index() {

		service.execute();

		ModelAndView mav = new ModelAndView();

		mav.setViewName("/index");

		return mav;
	}
}
