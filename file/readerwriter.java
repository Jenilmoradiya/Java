package com.file;


import java.io.FileWriter;
import java.io.FileReader;

public class readerwriter {
		public static void main(String[] args) throws Exception {
		
			FileWriter f=new FileWriter("file.txt");
			String s="This is my first file.";
		
			f.write(s);
			f.flush();
			f.close();
			System.out.println("File is created.");
		
		    FileReader fis=new FileReader("file.txt");
	        int i;
	        while((i=fis.read())!=-1) {
	        	
	        	System.out.print((char)i);
	        }
	        f.close();
		}  
	}

