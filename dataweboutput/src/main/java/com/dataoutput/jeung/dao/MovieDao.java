package com.dataoutput.jeung.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dataoutput.jeung.domain.Movie;

@Repository
public class MovieDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Movie> alldata() {
		return sqlSession.selectList("movie.allmovie");
	}
}
