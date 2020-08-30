package com.android.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.biz.user.UserVO;

@Service
public class LoginService {
	@Autowired
	LoginDAO loginDAO;
	public UserVO login(UserVO vo) {
		return loginDAO.login(vo);
	}
}

