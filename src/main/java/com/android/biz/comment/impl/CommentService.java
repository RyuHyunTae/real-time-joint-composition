package com.android.biz.comment.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.biz.board.BoardVO;
import com.android.biz.board.impl.BoardDAO;
import com.android.biz.comment.CommentVO;

@Service
public class CommentService {
	
	@Autowired
	CommentDAO commentDAO;
	
	public int insert(CommentVO vo) {
		System.out.println("��� ����");
		return commentDAO.insert(vo);
	}
	
	public int delete(CommentVO vo) {
		System.out.println("��� ����");
		return commentDAO.delete(vo);
	}
	
	public List<CommentVO> list(CommentVO vo) {
		System.out.println("��� �ҷ�����");
		return commentDAO.list(vo);
	}
	
}
