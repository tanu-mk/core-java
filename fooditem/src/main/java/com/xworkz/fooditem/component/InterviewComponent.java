package com.xworkz.fooditem.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fooditem.dto.InterviewDto;

@Component
@RequestMapping("/clear")
public class InterviewComponent {
	
	
	@PostMapping
	public String onClick(InterviewDto dto)
    {
  	  System.out.println("The Deatils are : " +dto);
  	  return "display.jsp";
    }

}
