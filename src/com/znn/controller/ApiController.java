package com.znn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.znn.service.UserService;
import com.znn.vo.User;

@Controller
public class ApiController {
	@Autowired
	private UserService userService;
	@RequestMapping("/user/{id:\\d+}")
	public @ResponseBody
	User getUser( @PathVariable int id) {
		// user = dao.queryAUser(id);
		// if (user == null) {
		// model.addAttribute("tip", "<font color='red'>用户不存在！</font>");
		// }else {
		// model.addAttribute("tip", user.toString());
		// }
		User user= userService.selectByPrimaryKey(id);
		return user;
	}

	@RequestMapping(value = {"/user/*","/user"}, method = RequestMethod.GET)
	public @ResponseBody
	List<User> getTest(Model model, HttpServletResponse response,
			HttpServletRequest request) {
		List<User> list = null;
		// List<User> list = dao.query();
		// String tipString = "";
		// for (int i = 0; i < list.size(); i++) {
		// tipString += list.get(i).toString()+"<br />";
		// }
		// model.addAttribute("tip",tipString);
		list = userService.selectAllUser();
		return list;
	}
}
