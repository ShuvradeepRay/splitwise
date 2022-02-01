package com.sstocode.splitwise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sstocode.splitwise.entity.Test;
import com.sstocode.splitwise.service.TestService;

@RestController
@RequestMapping(value = "/main")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/test")
	public String helloTestExample() {
		return "test";
	}
	
	@GetMapping("/fetchsql")
	public List<Test> fetchSQL() {
		System.out.println("SQL test...................... ...............");
		return testService.fetchSql();
	}

}
