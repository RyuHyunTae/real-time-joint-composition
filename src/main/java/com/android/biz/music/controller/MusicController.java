package com.android.biz.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.biz.music.MusicVO;
import com.android.biz.music.impl.MusicService;

@RestController
@RequestMapping(value="/music")
public class MusicController {
	@Autowired
	MusicService musicService;
	
	@PostMapping(value="insert")
	int insert(@RequestBody MusicVO vo) {
		System.out.println(vo.toString());
		return musicService.insert(vo);
	}
	
	@PostMapping(value="update")
	int update(@RequestBody MusicVO vo) {
		System.out.println(vo.toString());
		return musicService.update(vo);
	}
	
	@PostMapping(value="delete")
	int delete(@RequestBody MusicVO vo) {
		System.out.println(vo.toString());
		return musicService.delete(vo);
	}
	
	@PostMapping(value="list")
	List<MusicVO> list(@RequestBody MusicVO vo) {
		return musicService.list(vo);
	}

}