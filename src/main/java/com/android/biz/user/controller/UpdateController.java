package com.android.biz.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.biz.user.UserVO;
import com.android.biz.user.impl.UpdateService;

@RestController
@RequestMapping(value="/update")
public class UpdateController {
	@Autowired
	UpdateService updateService;
	
	@PostMapping(value="")
	int update(@RequestBody UserVO vo) {
		System.out.println(vo.toString());
		return updateService.update(vo);
	}
}