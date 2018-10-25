package com.dataoutput.jeung;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dataoutput.jeung.dao.MovieDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class DataTest {
	
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private MovieDao movieDao;
	
	@Test
	public void movieTest () throws Exception {
		//System.out.println(sqlSession);
		System.out.println(sqlSession.selectList("movie.allmovie"));
		System.out.println(movieDao.alldata());
		
	}

}
