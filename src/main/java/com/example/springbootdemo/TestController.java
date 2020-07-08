package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TestController {
		
		@Autowired
		TestService service;
	 
		@GetMapping("/feedback")
		@RequestMapping(value = "/feedback", method = RequestMethod.GET)
		public void feedbackForm(Model model) {
			model.addAttribute("Feedback", new Feedback());
			
			
		}
		
		@PostMapping("/feedback")
		@ResponseBody
		public String feedbackSubmit(@RequestParam("name")String name,@RequestParam("email")String email, @RequestParam("location")String location, 
				@RequestParam("comments")String comments)
		{		
			
				boolean data = service.addResponse(name, email, location, comments);
				if(data){
					return "Thanks for the feedback";					
				}
				else{
					return "error";
				}
			}
		}

