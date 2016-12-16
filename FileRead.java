package com.sd.io;
 import java.io.File;
 import java.io.FileReader;
 import java.io.IOException;

public class FileRead{
	public static void main(String[] args) throws Exception {
		File f= new File("test.txt");
		FileReader fr= new FileReader(f);
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);

		}
		fr.close();
	}
}
 
		