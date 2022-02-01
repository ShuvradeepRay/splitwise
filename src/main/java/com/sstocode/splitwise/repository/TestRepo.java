package com.sstocode.splitwise.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sstocode.splitwise.dao.TestDao;
import com.sstocode.splitwise.entity.Test;

@Repository
@Transactional
public class TestRepo implements TestDao {
	
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Test> getTestData() {
		List<Test> result =  (List<Test>) entityManager.createQuery("from Test", Test.class).getResultList();
		return result;
	}

}
