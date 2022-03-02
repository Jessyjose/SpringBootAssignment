package com.genspark.mobilephonedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MobilephonedemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(MobilephonedemoApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsumg s7 = (Samsumg) context.getBean(Samsumg.class);
		s7.config();
		ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context1.getBean(Student.class);
		System.out.println("Student ID :"+student.getStudentID());
		System.out.println("Name :"+student.getName());
		for(String s : student.getContactNumbers()) {
			System.out.println("Contact number : "+s);
		}
		System.out.println("City :"+student.getAddress().getCity());
		System.out.println("State :"+student.getAddress().getState());
		System.out.println("Country :"+student.getAddress().getCountry());
	}

}
