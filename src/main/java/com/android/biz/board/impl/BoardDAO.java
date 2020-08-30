package com.android.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.android.biz.board.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	SqlSession sqlSession;
	
	int insert(BoardVO vo) {
		System.out.println(vo.toString());
		return sqlSession.insert("boardDAO.insertBoard", vo);
	}
	
	int update(BoardVO vo) {
		System.out.println(vo.toString());
		return sqlSession.insert("boardDAO.updateBoard", vo);
	}
	
	int delete(BoardVO vo) {
		System.out.println(vo.toString());
		return sqlSession.insert("boardDAO.deleteBoard", vo);
	}
	
	List<BoardVO> list(BoardVO vo) {
		return sqlSession.selectList("boardDAO.listBoard", vo);
	}
	
	List<BoardVO> select(BoardVO vo) {
		return sqlSession.selectList("boardDAO.selectBoard", vo);
	}
	
}
