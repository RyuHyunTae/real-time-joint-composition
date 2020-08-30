package com.android.biz.comment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.biz.board.BoardVO;
import com.android.biz.comment.CommentVO;
import com.android.biz.comment.impl.CommentService;

@RestController
@RequestMapping(value="/comment")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@PostMapping(value="insert")
	int insert(@RequestBody CommentVO vo) {
		System.out.println(vo.toString());
		return commentService.insert(vo);
	}
	@PostMapping(value="delete")
	int delete(@RequestBody CommentVO vo) {
		System.out.println(vo.toString());
		return commentService.delete(vo);
	}
	@PostMapping(value="list")
	List<CommentVO> list(@RequestBody CommentVO vo) {
		return commentService.list(vo);
	}
	
}
