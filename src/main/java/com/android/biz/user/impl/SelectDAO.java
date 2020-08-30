package com.android.biz.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.android.biz.board.BoardVO;
import com.android.biz.user.UserVO;

@Repository
public class SelectDAO {
	@Autowired
	SqlSession sqlSession;
	
	List<UserVO> select(UserVO vo) {
		return sqlSession.selectList("selectDAO.select", vo);
	}
}
