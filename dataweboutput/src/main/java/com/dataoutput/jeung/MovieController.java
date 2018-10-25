package com.dataoutput.jeung;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dataoutput.jeung.domain.Movie;
import com.dataoutput.jeung.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="views/movie", method=RequestMethod.GET)
	public String movie(Model model) {
		System.out.println("컨트롤러 도착");
		List<Movie> list = movieService.alldata();
		model.addAttribute("list",list);
		System.out.println("데이터 저장");
		return "movie";
	}
}
