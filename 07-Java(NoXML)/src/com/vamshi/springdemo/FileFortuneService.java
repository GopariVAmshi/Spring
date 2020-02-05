package com.vamshi.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.*;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


public class FileFortuneService implements FortuneService {
	
	private String fileName="fortune-data.txt";
	private List<String>theFortunes;
	
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		System.out.println(">>FileFortuneService: inside default constructor\n");
	}
	
	@PostConstruct
	private void loadTheFortuneFile() {
		
		System.out.println(">>FileFortuneService: inside method loadTheFortuneFile\n");
		
		File theFile=new File(fileName);
		
		System.out.println("Reading fortune from file:"+theFile+"\n");
		System.out.println("File exists:"+theFile.exists()+"\n");
		
		theFortunes = new ArrayList<String>();
		
		try(BufferedReader br=new BufferedReader(new FileReader(theFile))){
			
			String tempLine;
			
			while((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(theFortunes.size());
		
		String tempFortune = theFortunes.get(index);
		
		return tempFortune+"\n";
	}

}
