package com.android.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.biz.board.BoardVO;

@Service
public class BoardService {
	@Autowired
	BoardDAO boardDAO;
	
	public int insert(BoardVO vo) {
		System.out.println("�Խù� ����");
		return boardDAO.insert(vo);
	}
	
	public int update(BoardVO vo) {
		System.out.println("�Խù� ����");
		return boardDAO.update(vo);
	}
	
	public int delete(BoardVO vo) {
		System.out.println("�Խù� ����");
		return boardDAO.delete(vo);
	}
	
	public List<BoardVO> list(BoardVO vo) {
		System.out.println("�Խù� �ҷ�����");
		return boardDAO.list(vo);
	}
	
	public List<BoardVO> select(BoardVO vo) {
		System.out.println("�Խù� �󼼺���");
		return boardDAO.select(vo);
	}
}
