package com.example.myapp;

import com.example.myapp.dao.StudentDAO;
import com.example.myapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner-> {                                               //lambda expression
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			readStudent(studentDAO);
		};
	}

	/*private void createStudent(StudentDAO studentDAO) {
		//create one student object
		System.out.println("Creating new student object.....");
		Student std = new Student("shikha","pandey","s88p@gmail.com");

		//save the student object
		System.out.println("save student object.....");
		studentDAO.save(std);
		//display the id of the save student
		System.out.println("display save student generate id....." + std.getId());
	} */

//	private void createMultipleStudent(StudentDAO studentDAO){
//		//create multiple student object
//		System.out.println("Creating new students object.....");
//		Student std1 = new Student("John","janz","jj@gmail.com");
//		Student std2 = new Student("Henry","josh","hj@gmail.com");
//		Student std3 = new Student("July","jain","jj2@gmail.com");
//
//		//save the students object
//		System.out.println("save student object.....");
//		studentDAO.save(std1);
//		studentDAO.save(std2);
//		studentDAO.save(std3);
//	}

	private void readStudent(StudentDAO studentDAO){
		System.out.println("Read student object.....");
		Student rstd = new Student("Test","read","trjj@gmail.com");

		System.out.println("save student.....");
		studentDAO.save(rstd);

		//display id of the saved student
		int sid = rstd.getId();
		System.out.println("display id student....." + sid);
		//read student based on id PK
		System.out.println("save student.....by ID PK");
		Student mystd = studentDAO.findById(sid);
		System.out.println("display id student....." + mystd);
	}


}
