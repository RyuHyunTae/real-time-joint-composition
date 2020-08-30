package com.android.biz.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.biz.user.UserVO;
import com.android.biz.user.impl.JoinService;

@RestController
@RequestMapping(value="/join")
public class JoinController {
	@Autowired
	JoinService joinService;
	
	@PostMapping(value="")
	int join(@RequestBody UserVO vo) {
		System.out.println(vo.toString());
		return joinService.join(vo);
	}
}
