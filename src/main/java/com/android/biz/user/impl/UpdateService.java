package com.android.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.biz.user.UserVO;

@Service
public class UpdateService {
	@Autowired
	UpdateDAO updateDAO;
	public int update(UserVO vo) {
		return updateDAO.update(vo);
	}
}

