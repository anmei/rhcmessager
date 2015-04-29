package com.rhc.test.service;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.rhc.test.dao.TestDao;


@Service("testService")
public class TestServiceImp implements TestService{
	@Resource
	private TestDao testDao;
	
	@Cacheable(value="tempCache",key="'find_'+#para")
	public String find(String para) {
		return testDao.find(para);
	}
}
