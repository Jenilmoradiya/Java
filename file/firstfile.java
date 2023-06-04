package com.file;

import java.io.FileOutputStream;
import java.io.FileInputStream;

public class firstfile {

	public static void main(String[] args) throws Exception {
	
		FileOutputStream f=new FileOutputStream("file.txt");
		String s="This is my first file.";
		byte b[]=s.getBytes();
		f.write(b);
		f.flush();
		f.close();
		System.out.println("File is created.");
	
	    FileInputStream fis=new FileInputStream("file.txt");
        int i;
        while((i=fis.read())!=-1) {
        	
        	System.out.print((char)i);
        }
        
	}  
}
