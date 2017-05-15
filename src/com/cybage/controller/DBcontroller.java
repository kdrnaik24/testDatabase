package com.cybage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.service.DBservice;




@RestController
public class DBcontroller 
{
	public DBcontroller() //constructor
	{
	}
	
	
	@RequestMapping("/test")
	public ModelAndView test1page() //method
	{
		System.out.println("In controller");
		ModelAndView modelAndView = new ModelAndView("test1");
		modelAndView.addObject("msg", "Add details");
		return modelAndView;
	}
	
	@RequestMapping(value = "/onclick", method = RequestMethod.GET)
	public ModelAndView workItemsPerResource(Model model, HttpServletRequest request) throws Exception {
			DBservice dbservice = new DBservice();
			ModelAndView modelAndView = new ModelAndView("test2");

			 dbservice.getAllIssues(request.getParameter("uname"),
					request.getParameter("upass"), request.getParameter("uprojectId"));
			
			
			//modelAndView.addObject("username", resp);
			modelAndView.addObject("date", request.getParameter("udate"));
			return modelAndView;
		
	}

		
}
	
	

