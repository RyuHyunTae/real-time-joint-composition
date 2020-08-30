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
		System.out.println("��ǥ ����");
		return musicDAO.insert(vo);
	}
	
	public int update(MusicVO vo) {
		System.out.println("��ǥ ����");
		return musicDAO.update(vo);
	}
	
	public int delete(MusicVO vo) {
		System.out.println("��ǥ ����");
		return musicDAO.delete(vo);
	}
	
	public List<MusicVO> list(MusicVO vo) {
		System.out.println("��ǥ �ҷ�����");
		return musicDAO.list(vo);
	}
}