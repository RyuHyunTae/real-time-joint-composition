package com.android.biz.music.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.android.biz.music.MusicVO;

@Repository
public class MusicDAO {
	@Autowired
	SqlSession sqlSession;
	
	int insert(MusicVO vo) {
		System.out.println(vo.toString());
		return sqlSession.insert("musicDAO.insertMusic", vo);
	}
	
	int update(MusicVO vo) {
		System.out.println(vo.toString());
		return sqlSession.insert("musicDAO.updateMusic", vo);
	}
	
	int delete(MusicVO vo) {
		System.out.println(vo.toString());
		return sqlSession.insert("musicDAO.deleteMusic", vo);
	}
	
	List<MusicVO> list(MusicVO vo) {
		return sqlSession.selectList("musicDAO.listMusic", vo);
	}
	
	
}
