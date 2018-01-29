package com.ssm.action;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.entity.School;
import com.ssm.entity.User;
import com.ssm.service.SchoolServiceImp;
import com.ssm.service.UserServiceImp;

@Controller
public class SchoolAction{
	SchoolServiceImp service;
	UserServiceImp userService;
	public SchoolServiceImp getService() {
		return service;
	}
	@Resource(name="schoolService")
	public void setService(SchoolServiceImp service) {
		this.service = service;
	}
	
	public UserServiceImp getUserService() {
		return userService;
	}
	@Resource(name="userService")
	public void setUserService(UserServiceImp userService) {
		this.userService = userService;
	}
	@RequestMapping(value="/school",method={RequestMethod.POST,RequestMethod.GET})
	public String selAll(ModelMap modelMap){
		List<School> schools=service.selAll();
		modelMap.addAttribute("schools",schools);
		return "school";
	}
	@RequestMapping(value="/schooltoadd",method={RequestMethod.GET,RequestMethod.POST})
	public String schoolToadd(ModelMap modelMap){
		List<User> users=userService.selAll();
		modelMap.addAttribute("users",users);
		return "schooltoadd";
	}
	@RequestMapping(value="/schooldoadd",method={RequestMethod.GET,RequestMethod.POST})
	public String schooldoadd(HttpServletRequest request){
		String name=request.getParameter("name");
		int userid=Integer.parseInt(request.getParameter("userid"));
		School o=new School();
		o.setName(name);
		User user=new User();
		user.setId(userid);
		o.setUser(user);
		int result=service.addSchool(o);
		if(result>0){
			return "redirect:school.action";
		}else{
			return null;
		}
	}
}
