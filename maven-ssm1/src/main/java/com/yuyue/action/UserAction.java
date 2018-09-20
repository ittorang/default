package com.yuyue.action;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.yuyue.entity.User;
import com.yuyue.service.UserService;
import com.yuyue.util.FileUp;

@Controller
@RequestMapping("/")
public class UserAction {
	@Resource
	UserService us;
	
	FileUp fileup = new FileUp();
	
	@RequestMapping("register")
	public String register(HttpServletRequest request,CommonsMultipartResolver selfie) {
		String userName = request.getParameter("userName").toString();
		String passWord = request.getParameter("passWord").toString();
		List<MultipartFile> doUP = fileup.doUP(request);
		MultipartFile multipartFile = doUP.get(0);
			User user = new User(userName, passWord, part.toString());
			us.register(user);
		
		
		return "success";
	}
	@RequestMapping("/welcome")
	public String welcom() {
		return "register";
	}

}
