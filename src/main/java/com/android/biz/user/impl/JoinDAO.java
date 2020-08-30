package com.android.biz.user.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.android.biz.user.UserVO;

@Repository
public class JoinDAO {
	@Autowired
	SqlSession sqlSession;
	
	int join(UserVO vo) {
		System.out.println(vo.getId());
		return sqlSession.insert("joinDAO.join", vo);
	}
}