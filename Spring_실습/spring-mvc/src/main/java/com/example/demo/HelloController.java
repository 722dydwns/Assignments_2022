package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model, @RequestParam(value = "name", required = false) String name) {
		model.addAttribute("greeting", "안녕하세요" + name);
		return "hello";
	}

	// 로그인
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	// 로그인 체크
	@GetMapping("/logincheck")
	public String logincheck(Model model, @RequestParam(value = "id") String id,
			@RequestParam(value = "pwd") String pwd) {

		// 경로에 들어온 데이터값이 로그인 값 일치할 경우에 한해서
		if ("abcd".equals(id) && "1234".equals(pwd)) {

			model.addAttribute("id", id);
		}

		return "logincheck";
	}

}