package com.heli.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.heli.product.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productSerivce;

	@RequestMapping(value = "/product.html")
	protected ModelAndView productPage(){

		ModelAndView modelAndView = new ModelAndView("productForm");
		modelAndView.addObject("error", true);
		return modelAndView;
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public ModelAndView evaluateForm(@ModelAttribute("product1") Product product){
		ModelAndView mav = new ModelAndView("evaluateResult");
		String flag = "failed";
		int success = productSerivce.saveOrUpdateProduct(product);
		if(success > 0){
			flag = "success";
		}
		mav.addObject("flag", flag);
		
		return mav;
	}
}
