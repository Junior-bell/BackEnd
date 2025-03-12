package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {
	@GetMapping("/")
	public String showHomePage()
	{
		//return LVN(home page --welcome.jsp)
		return "welcome";
	}

@GetMapping("/register")
public String showForm(@ModelAttribute("stud") Student st)
{
	System.out.println("StudentOperationsController.showForm()");
	System.out.println("model class object data:: "+st);
	//return LVN
	return "student_register";
}
@PostMapping("/register")
public String processStudent(Map<String,Object> map,@ModelAttribute("stud") Student st)
{
	System.out.println("StudentOperationsController.processStudent()");
	System.out.println("Model class object data :: "+st);
	//generate result
	String grade=null;
	if(st.getAvg()>=75)
	{
		grade="first class with Distinction";
	}
	else if(st.getAvg()>=60)
	{
		grade="first class";
	}
	else if(st.getAvg()>=50)
	{
		grade="Second class";
	}
	else if(st.getAvg()>=35)
	{
		grade="Third class";
	}
	else
	{
		grade="fail";
	}
	//keep result in model attribute
	map.put("result", grade);
	//return LVN
	return "show_result";
} 

}
