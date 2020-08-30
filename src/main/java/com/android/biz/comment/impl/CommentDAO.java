package com.android.biz.comment.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.android.biz.board.BoardVO;
import com.android.biz.comment.CommentVO;

@Repository
public class CommentDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	int insert(CommentVO vo) {
		System.out.println(vo.toString());
		return sqlSession.insert("commentDAO.insertComment", vo);
	}
	
	int delete(CommentVO vo) {
		System.out.println(vo.toString());
		return sqlSession.insert("commentDAO.deleteComment", vo);
	}
	
	List<CommentVO> list(CommentVO vo) {
		return sqlSession.selectList("commentDAO.listComment", vo);
	}
}
