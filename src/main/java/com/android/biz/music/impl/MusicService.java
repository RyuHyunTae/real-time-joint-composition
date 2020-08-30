package com.android.biz.music.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.biz.music.MusicVO;

@Service
public class MusicService {
	@Autowired
	MusicDAO musicDAO;
	
	public int insert(MusicVO vo) {
		System.out.println("음표 삽입");
		return musicDAO.insert(vo);
	}
	
	public int update(MusicVO vo) {
		System.out.println("음표 수정");
		return musicDAO.update(vo);
	}
	
	public int delete(MusicVO vo) {
		System.out.println("음표 삭제");
		return musicDAO.delete(vo);
	}
	
	public List<MusicVO> list(MusicVO vo) {
		System.out.println("음표 불러오기");
		return musicDAO.list(vo);
	}
}