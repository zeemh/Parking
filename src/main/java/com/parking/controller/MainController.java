package com.parking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/map")
	public String insertParking() {
		return "insertParking";
	}
	
	@RequestMapping("/succes")
	public String succes() {
		return "succes";
	}
	
	@RequestMapping("/cancle")
	public String cancle() {
		return "cancle";
	}

	@RequestMapping("/kakao")
	public String kakaoMap() {
		return "kakaoMap";
	}

	@RequestMapping("/useparking")
	public String useparking() {
		return "useparking";
	}
	
	@RequestMapping("/pay")
	public String pay() {
		return "pay";
	}
}
