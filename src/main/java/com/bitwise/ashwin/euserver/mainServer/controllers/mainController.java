package com.bitwise.ashwin.euserver.mainServer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {
	
	@RequestMapping(value="/show")
	@ResponseBody
	public String show() {
		return "<h1>This is Mars, updated through jenkins</h1>";
	}
}
