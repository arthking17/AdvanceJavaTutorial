package com.example.demo;

import java.io.IOException;
import java.sql.Connection;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.enums.Color;
import com.example.demo.service.ByteStreamExample;
import com.example.demo.service.CharacterStreamExample;
import com.example.demo.service.MathUtils;
import com.example.demo.thread.Thread1;
import com.example.demo.thread.Thread2;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


		/*
		 * Color color = Color.BLUE;
		 * 
		 * System.out.println("Value : " + color.getValue());
		 * System.out.println("Name : " + color.name());
		 * 
		 * MathUtils obj = new MathUtils();
		 * 
		 * Thread1 t1 = new Thread1(obj);
		 * Thread t2 = new Thread(new Thread2(obj));
		 * 
		 * t1.start();
		 * t2.start();
		 */

		/* ByteStreamExample byteStreamExample = new ByteStreamExample();
		try {
			byteStreamExample.copyFile("C:\\Users\\ngues\\Documents\\test.txt", "C:\\Users\\ngues\\Documents\\dest.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} */
		
		/* CharacterStreamExample characterStreamExample = new CharacterStreamExample();
		try {
			characterStreamExample.copyFile("C:\\Users\\ngues\\Documents\\test.txt", "C:\\Users\\ngues\\Documents\\dest.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} */


	}

}
