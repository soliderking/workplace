package com.ssm.action;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.entity.User;
import com.ssm.service.UserServiceImp;

@Controller
public class UserAction {
	UserServiceImp service;
	
	public UserServiceImp getService() {
		return service;
	}
	@Resource(name="userService")
	public void setService(UserServiceImp service) {
		this.service = service;
	}

	@RequestMapping(value="/show",method={RequestMethod.GET,RequestMethod.POST})
	public String showUser(ModelMap modelMap,HttpServletRequest request){
		User user=service.selByUser(1);
		//modelMap.addAttribute("user",user);
		request.setAttribute("user",user);
		user.setName("bb");
		//request.setAttribute("user",user);
		modelMap.addAttribute("user",user);
		return "user";
	}
}
