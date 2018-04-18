package com.kong_food_map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kong_food_map.domain.KongFood;
import com.kong_food_map.domain.Member;
import com.kong_food_map.repository.KongFoodRepository;

@Controller
@RequestMapping("/kongfood")
public class KongFoodController {
	
	@Autowired
	KongFoodRepository kongFoodDao;
	
	@RequestMapping("/list")
	public ModelAndView kongFoodList() throws Exception{
		ModelAndView mav = new ModelAndView("kongfood/list");
		return mav;
	}
	
//	@RequestMapping("/list")
//	public String kongFoodList(Model model){
//		List<KongFood> list = kongFoodDao.findAll();
//		model.addAttribute("list",list);
//		return "/kongfood/list";
//	}
}
