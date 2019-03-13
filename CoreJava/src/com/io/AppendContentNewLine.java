package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendContentNewLine {

	public static void main(String[] args) {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try{
			file = new File ("D:\\Thulasi\\newfile.txt");
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println("Welcome to Files");
			pw.close();
		}
		catch(IOException io)
		{
			
		}
	}

}
