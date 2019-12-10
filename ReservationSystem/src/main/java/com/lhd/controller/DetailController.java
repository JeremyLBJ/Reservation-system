package com.lhd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhd.entity.Classificationofgoods;
import com.lhd.service.IndexService;

@Controller
@RequestMapping("/Detail")
public class DetailController {
	
	@Autowired
	private IndexService indexService ; 
	
	@RequestMapping("/detail")
	public String detail (Model model) {
		List<Classificationofgoods> list = indexService.findAll();
		model.addAttribute("fList", list);
		return "Detail" ;
	}

}
