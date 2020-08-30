package com.android.biz.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.biz.board.BoardVO;
import com.android.biz.user.UserVO;
import com.android.biz.user.impl.SelectService;

@RestController
@RequestMapping(value="/select")
public class SelectController {
	@Autowired
	SelectService selectService;
	
	@PostMapping(value="")
	List<UserVO> list(@RequestBody UserVO vo) {
		return selectService.select(vo);
	}
}
