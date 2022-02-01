package com.sstocode.splitwise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sstocode.splitwise.entity.Test;
import com.sstocode.splitwise.repository.TestRepo;
import com.sstocode.splitwise.validator.TestValidator;

@Service
public class TestService {
	
	@Autowired
	private TestValidator testValidator;
	
	@Autowired
	private TestRepo testRepo;
	
	public List<Test> fetchSql() {
		// call validator layer here
		if(testValidator.testValidation()) {
			return testRepo.getTestData();
		}
		return null;
		
	}

}
