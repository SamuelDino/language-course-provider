package com.example.languagecourseprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@RequestMapping(value = "/course-provider")
public class LanguageCourseProviderApplication {

	@GetMapping("/getAllCourses")
	public ResponseEntity<List<String>> getCourses(){
		List<String> courses = Stream.of("Java", "Python", "JavaScript").collect(Collectors.toList());
		return ResponseEntity.ok(courses);
	}
	public static void main(String[] args) {
		SpringApplication.run(LanguageCourseProviderApplication.class, args);
	}

}
