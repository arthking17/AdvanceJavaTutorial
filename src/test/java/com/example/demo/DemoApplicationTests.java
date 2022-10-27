package com.example.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.enums.Color;
import com.example.demo.model.Student;

@SpringBootTest
class DemoApplicationTests {

	String filename = "C:\\Users\\ngues\\Documents\\test.txt";

	@Test
	void contextLoads() {
	}

	@Test
	void testColorEnum() {

		Color color = Color.BLUE;

		System.out.println("Value : " + color.getValue());
		System.out.println("Name : " + color.name());
	}

	@Test
	void testStudentSerialized() {
		Student student = new Student("Mouad", 23, "Ariana Soghra");
		student.setX(10);
		ArrayList<Student> students = new ArrayList<>();

		students.add(student);

		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;

		// Serialization
		try {
			fileOut = new FileOutputStream(filename);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(students);

			objOut.close();
			fileOut.close();

			System.out.println("The object has been serialized: " + students);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	@Test
	void testStudentDeserialized() throws ClassNotFoundException {
		// Deserialization
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		try {
			fileIn = new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn);

			ArrayList<Student> object = (ArrayList<Student>) objIn.readObject();

			System.out.println("The object has been deserialized: " + object);

			objIn.close();
			fileIn.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
