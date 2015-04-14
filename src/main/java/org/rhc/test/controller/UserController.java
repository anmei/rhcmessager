package org.rhc.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*注解式页面控制器，无需实现Controller接口*/

@Controller
@RequestMapping(value="/user/*")
public class UserController {
	
	@RequestMapping(value="userindex")
	public String userIndex(@RequestParam("age") Integer age){
		//1、收集参数、验证参数  
		//2、绑定参数到命令对象  
		//3、将命令对象传入业务对象进行业务处理  
		//4、选择下一个页面  
		return null;
	}
}
