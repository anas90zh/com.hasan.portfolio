package com.hasan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomePage {
	 @RequestMapping("/")
	    public String home(){
	        return "index";
	    }
}
