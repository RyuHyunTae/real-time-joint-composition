package com.android.biz.user.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.android.biz.user.UserVO;

@Repository
public class UpdateDAO {
	@Autowired
	SqlSession sqlSession;
	
	int update(UserVO vo) {
		return sqlSession.insert("updateDAO.update",vo);
	}
}
