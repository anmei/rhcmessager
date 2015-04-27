package org.rhc.test.controller;

import javax.annotation.Resource;

import org.rhc.test.dao.TestDao;
import org.rhc.test.service.TestService;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoader;

/*注解式页面控制器，无需实现Controller接口*/

@Controller
@RequestMapping(value="/user/*")
public class UserController {
	@Resource
	private TestService testService;
	@Resource
	private TestDao testDao;
	
	
	@RequestMapping(value="userindex")
	public String userIndex(@RequestParam("age") Integer age){
		//1、收集参数、验证参数  
		//2、绑定参数到命令对象  
		//3、将命令对象传入业务对象进行业务处理  
		//4、选择下一个页面  
		return null;
	}
	
	
	@RequestMapping(value="testEhcache.action")
	public String testEhcache(String param) throws InterruptedException{
		System.out.println(param);
		String res = testDao.find(param);
		System.out.println(res);
		
		String abc = testDao.find(param);
		System.out.println(res);
		
		CacheManager manager = (CacheManager)ContextLoader.getCurrentWebApplicationContext().getBean("cacheManager");
	    Cache cache = manager.getCache("tempCache");
		System.out.println("缓冲："+cache.get("find_fsd"));
		
		return "";
	}
}
