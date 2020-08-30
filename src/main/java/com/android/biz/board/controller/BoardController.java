package com.android.biz.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.biz.board.BoardVO;
import com.android.biz.board.impl.BoardService;

@RestController
@RequestMapping(value="/board")
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@PostMapping(value="insert")
	int insert(@RequestBody BoardVO vo) {
		System.out.println(vo.toString());
		return boardService.insert(vo);
	}
	
	@PostMapping(value="update")
	int update(@RequestBody BoardVO vo) {
		System.out.println(vo.toString());
		return boardService.update(vo);
	}
	
	@PostMapping(value="delete")
	int delete(@RequestBody BoardVO vo) {
		System.out.println(vo.toString());
		return boardService.delete(vo);
	}
	
	@PostMapping(value="list")
	List<BoardVO> list(@RequestBody BoardVO vo) {
		return boardService.list(vo);
	}
	
	@PostMapping(value="select")
	List<BoardVO> select(@RequestBody BoardVO vo) {
		return boardService.select(vo);
	}
}
