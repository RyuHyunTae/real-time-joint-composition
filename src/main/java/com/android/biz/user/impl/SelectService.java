package com.android.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.biz.board.BoardVO;
import com.android.biz.user.UserVO;

@Service
public class SelectService {
	@Autowired
	SelectDAO selectDAO;
	public List<UserVO> select(UserVO vo) {
		System.out.println("�����̸� �ҷ�����");
		return selectDAO.select(vo);
	}
}

