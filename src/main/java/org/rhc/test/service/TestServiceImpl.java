package org.rhc.test.service;

import javax.annotation.Resource;

import org.rhc.test.dao.TestDao;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService{
	@Resource
	private TestDao testDao;
	
	@Override
//	@Cacheable(value="tempCache",key="'find_'+#para")
	public String find(String para) {
		return testDao.find(para);
	}

}
