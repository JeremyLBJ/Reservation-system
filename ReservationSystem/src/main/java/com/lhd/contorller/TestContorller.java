package com.lhd.contorller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lhd.common.Result;

@Controller
public class TestContorller {
	@RequestMapping("carts")
	public String atse(Model model) {
		List<String> list = new ArrayList<>();
		list.add("123465");
		list.add("1234566");
		list.add("148");
		model.addAttribute("List", list);
		return "Carts";
	}
	
	@PostMapping("cart")
	@ResponseBody
	public Result carts(Model model) {
		List<String> list = new ArrayList<>();
		list.add("123465");
		list.add("1234566");
		list.add("148");
		model.addAttribute("List", list);
		return new Result(1,"成功",list);
	}
	
	@RequestMapping("login")
	public String login() {
		return "Login";
	}
	
	
	@RequestMapping("detail")
	public String detail() {
		return "Detail";
	}

	@RequestMapping("sign")
	public String sign() {
		return "Sign";
	}
	
	@RequestMapping("index")
	public String index() {
		return "Index";
	}
}
