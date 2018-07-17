package com.zamir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This alone is enough to run the app
//@SpringBootApplication
//public class CourseApiApp {
//
//	public static void main(String[] args) {
//		SpringApplication.run(CourseApiApp.class, args);
//	}
//}


//This is the first	step in telling spring that this is a Spring boot application, hence the name of the annotation
@SpringBootApplication
public class CourseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApiApplication.class, args);
    }
}
