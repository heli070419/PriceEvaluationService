package com.heli.index;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Servlet implementation class IndexController
 */
@Controller
public class IndexController {

	@RequestMapping(value = "/")
	protected ModelAndView indexPage(){

		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("error", true);
		return modelAndView;
	}

}
