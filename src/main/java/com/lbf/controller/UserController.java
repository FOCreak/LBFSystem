package com.lbf.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.lbf.entity.User;
import com.lbf.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	@RequestMapping("/showUser")
	public String index(@RequestBody(required=false) String body,HttpServletRequest hsq,Model model){
		System.out.println(hsq.getParameter("id"));
		System.out.println("================================/n" + body);
		int userId = Integer.parseInt(hsq.getParameter("id"));
		User user = userService.getUserById(userId);
		System.out.print("user:" + user);
//		User user = new User();
//		user.setUserName("123456");
		model.addAttribute("user",user);
		return "user";
	}
}
