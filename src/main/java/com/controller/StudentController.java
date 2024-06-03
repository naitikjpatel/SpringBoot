package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBoxCricketBean;

@Controller
public class StudentController {

	@GetMapping("/register")
	public String boxRegister() {
		return "BoxCricketReg";
	}
	
	@PostMapping("/savereg")
	public String saveStudentDetails(StudentBoxCricketBean bean,Model model) {
		
		System.out.println(bean.getStudentName());
		System.out.println(bean.getPlayerType());
		System.out.println(bean.getFoodPreference());
		System.out.println(bean.getDrink());
		model.addAttribute("student",bean);
		
		return "RegistrationInfo";
	}
}
