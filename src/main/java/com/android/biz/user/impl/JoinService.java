package com.android.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.biz.user.UserVO;

@Service
public class JoinService {
	@Autowired
	JoinDAO joinDAO;
	
	public int join(UserVO vo) {
		System.out.println("»Æ¿Œ");
		return joinDAO.join(vo);
	}
}
