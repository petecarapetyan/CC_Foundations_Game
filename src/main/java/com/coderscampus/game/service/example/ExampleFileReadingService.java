package com.coderscampus.game.service.example;

import java.io.FileReader;
import java.io.IOException;

public class ExampleFileReadingService {


    public void printFileContents(String filePath){
        System.out.println(fileContents(filePath);
    }

	public String fileContents(String filePath) {
		FileReader fileReader = null;
		try {
		      fileReader=new FileReader(filePath);
		      StringBuilder content = new StringBuilder();
		      int nextChar;
		      while ((nextChar = fileReader.read()) != -1) {
		          content.append((char) nextChar);
		      }
		      return String.valueOf(content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
