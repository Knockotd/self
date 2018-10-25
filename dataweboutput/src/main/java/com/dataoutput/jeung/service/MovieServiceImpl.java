package com.dataoutput.jeung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataoutput.jeung.dao.MovieDao;
import com.dataoutput.jeung.domain.Movie;
@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDao movieDao;

	@Override
	public List<Movie> alldata() {
		
		return movieDao.alldata();
	}

}
