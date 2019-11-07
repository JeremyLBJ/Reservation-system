package com.lhd.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestContorller {
	
	@RequestMapping("carts")
	public String carts() {
		return "Carts";
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
