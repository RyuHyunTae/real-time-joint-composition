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
		System.out.println("게시물 삽입");
		return boardDAO.insert(vo);
	}
	
	public int update(BoardVO vo) {
		System.out.println("게시물 수정");
		return boardDAO.update(vo);
	}
	
	public int delete(BoardVO vo) {
		System.out.println("게시물 삭제");
		return boardDAO.delete(vo);
	}
	
	public List<BoardVO> list(BoardVO vo) {
		System.out.println("게시물 불러오기");
		return boardDAO.list(vo);
	}
	
	public List<BoardVO> select(BoardVO vo) {
		System.out.println("게시물 상세보기");
		return boardDAO.select(vo);
	}
}
