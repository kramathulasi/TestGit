package com.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader1 {

	public static void main(String[] args) throws IOException {

		String fileName = "D:\\Cisco\\Log4j.txt";
		FileReader fileReader = new FileReader(fileName);

		try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line = bufferedReader.readLine();
			while((line) != null) {
				System.out.println(line);
			}
		}
	}
	
}
