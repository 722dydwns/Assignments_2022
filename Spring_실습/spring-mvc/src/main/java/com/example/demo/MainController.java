package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@Autowired
	private MemberDao memberDao;

	@GetMapping(value = "/list") //이 경로 매핑 
	public String list(Model model) {
		List<Member> memberList = memberDao.selectAll(); //호출해주고 
		model.addAttribute("members", memberList); //모델에 대입해주고 
		return "list";
	}
}