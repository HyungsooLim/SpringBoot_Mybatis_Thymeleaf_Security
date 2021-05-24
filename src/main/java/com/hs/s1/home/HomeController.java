package com.hs.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() throws Exception {
		return "index";
	}
	
	@GetMapping("/admin")
	public void admin() throws Exception {
		System.out.println("===== Admin User =====");
	}
	
	@GetMapping("/member")
	public void member() throws Exception {
		System.out.println("===== Member User =====");
	}
}
