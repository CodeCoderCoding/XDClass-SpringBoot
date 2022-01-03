package net.xdclass.base_project.controller;


import java.util.Date;

import net.xdclass.base_project.domain.JsonData;
import net.xdclass.base_project.domain.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@作者 小D课堂  小D
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	
	/**
	 * 功能描述: 测试接口
	 * @return
	 */
	@GetMapping("find")
	public Object find(){
		
		User user = new User();
		user.setAge(11);
		user.setCreateTime(new Date());
		user.setName("xdclass");
		user.setPhone("10010000");
		
       return JsonData.buildSuccess(user);
	}
	
	
	
	
	
}
