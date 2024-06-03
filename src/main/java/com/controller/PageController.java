package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.Addition;
import com.bean.UserBean;

@Controller
public class PageController {

	@PostMapping("/login")
	public String loginPage() {

		return "Login";
	}
	
	@GetMapping("/signup")
	public String signupPage() {
		return "Signup";
	}
	
	@GetMapping("/welcome")
	public String welcomePage() {
		return "Welcome";
	}
	
	@GetMapping("/forgotpassword")
	public String forgotPasswordPage() {
		return "ForgotPassword";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(UserBean userBean,Model model) {
			//here we store the data in Model object and we passing it with Home.jsp in that file we can access the this data
		//here we not need towrite the request.getParameter
		System.out.println("Name is "+userBean.getFirstName());
		System.out.println("Email is "+userBean.getEmail());
		System.out.println("Password is "+userBean.getPassword());
		
		model.addAttribute("user", userBean);
		
		return "Home";
	}
	
	@PostMapping("/addNumber")
	public String addition(Addition add,Model model) {
		int no1=Integer.parseInt(add.getNumber1());
		int no2=Integer.parseInt(add.getNumber2());
		int sum=no1+no2;
		model.addAttribute("sum",sum);
		return "additionPage";
	}
	
	@GetMapping("/addition")
	public String addMethod() {
		return "addition";
	}
}
