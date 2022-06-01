package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController { //컨트롤러 
	
	@Autowired
	private CompanyMapper companyMapper;
	
	@PostMapping("") //API 에서 받은 값을 DB에 저장
	public Company post(@RequestBody Company company) {
		companyMapper.insert(company); 
	
		return company;
	}
	@GetMapping("") //DB 속 값을 API에서 전체 출력 
	public List<Company> getAll() {
		return companyMapper.getAll();
	}
	
}
