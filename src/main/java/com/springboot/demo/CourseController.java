package com.springboot.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> RetriveAllCourse()
	{
		return Arrays.asList(
				new Course(1, "springboot","udemy"),
				new Course(2, "springbootrest","udemy"),
				new Course(3, "springbootjpa","udemy"),
				new Course(4, "springboottest","udemy")
				);
				
	}
}
