package com.hs.s1.board.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {

	@GetMapping("list")
	public void getList() throws Exception {
		System.out.println("@@@@@ Notice List @@@@@");
	}
	
	@GetMapping("insert")
	public void setInsert() throws Exception {
		System.out.println("@@@@@ Notice Insert @@@@@");
	}
}
