package com.rhc.test.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rhc.test.dao.TestDao;
import com.rhc.test.entry.User;
import com.rhc.test.service.TestService;

/*注解式页面控制器，无需实现Controller接口*/

@Controller
@RequestMapping(value="/test/*")
public class TestController {
	@Resource
	private TestService testService;
	@Resource
	private TestDao testDao;
	
	
	@RequestMapping(value="main")
	public String main(Integer age){
		//1、收集参数、验证参数  
		//2、绑定参数到命令对象  
		//3、将命令对象传入业务对象进行业务处理  
		//4、选择下一个页面  
		return "main";
	}
	
	@RequestMapping(value="user")
	@ResponseBody
	public User user(){
		User u = new User();
		u.setUserName("fds沙发垫");
		u.setAge(21);
		u.setBirthday(new Date());
		return u;
	}
	
	@RequestMapping(value="getFromCache")
	public String getFromCache(String para){
		//按执行第一步,会输出：
		//get from db
		// a
		String res = testService.find(para);
		System.out.println(res);
		
		
		//第二步，会输出：
		//a
		String abc = testService.find(para);
		System.out.println(abc);
		
//		CacheManager manager = (CacheManager)ContextLoader.getCurrentWebApplicationContext().getBean("cacheManager");
//		Cache cache = manager.getCache("tempCache");
//		System.out.println("缓冲："+cache.get("find_fsd"));
		
		return "main";
	}
	
}
