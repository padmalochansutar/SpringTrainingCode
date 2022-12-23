package com.csmtech.controller;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.User;
import com.csmtech.service.UserService;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@Controller
public class MyController {

	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public String check() {
		return "loginPage";
	}

	@GetMapping("/login")
	public String login(@RequestParam("name") String uName, @RequestParam("pwd") String password) {
		List<User> users = userService.checkLogin(uName, password);
		for (User us : users) {
			if (uName.equals(us.getName())) {
				if (password.equals(us.getPassword())) {
					return "registrationPage";
				}
			}
		}

		return "invalidMsg";
	}

	@GetMapping("/registrationPage")
	public String registration() {

		return "registrationPage";

	}

	@GetMapping("/getAllData")
	public String getAllData(Model model) {

		model.addAttribute("userList", userService.findData());
		return "registrationPage";

	}

	@GetMapping("/saveData")
	public String saveData(@RequestParam(value = "userId", required = false) Long userId,
			@RequestParam("name") String userName, @RequestParam("gender") String gen,
			@RequestParam("branch") String branch, @RequestParam("pwd") String password) {

		User user = new User();
		if (userId != null)
			user.setUserId(userId);
		user.setName(userName);
		user.setGender(gen);
		user.setBranch(branch);
		user.setPassword(password);
		userService.saveAllData(user);
		return "redirect:/getAllData";
	}

	@GetMapping("/updateUser")
	public String updateUser(@RequestParam("userId") Long userId, Model model) {
		model.addAttribute("userList", userService.findData());
		model.addAttribute("upd", userService.updateUs(userId));
		return "registrationPage";
	}

	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("userId") Long userId) {

		userService.deleteUs(userId);
		return "forward:/getAllData";
	}
}
