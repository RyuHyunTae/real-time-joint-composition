package com.android.biz.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.biz.user.UserVO;
import com.android.biz.user.impl.LoginService;

@RestController
@RequestMapping(value="login")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@PostMapping(value="")
	UserVO login(@RequestBody UserVO vo) {
		System.out.println("·Î±×ÀÎ");
		return loginService.login(vo); 
	}
}
