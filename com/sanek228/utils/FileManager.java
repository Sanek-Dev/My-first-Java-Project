package com.sanek228.utils;
import java.io.*;
public class FileManager{
	private String fileName;
	public FileManager(String file) {
		this.fileName = file;
	}
	public void createFile(String name) {
		try {
		if(fileName == "none") {
			  File file = new File("./com/sanek228/files/" + name);
			  file.createNewFile();
			  System.out.println("Файл " + name + " был успешно создан(./com/sanek228/files/" + name + ")!");
		  } else {
			 
 System.out.println("Чувак,зачем тебе создавать файл,если ты его указал в конструкторе?");
			  System.exit(0);
		  };
	} catch (IOException e) {};
	}
	public void readFile() {
		try {
		File file = new File("./com/sanek228/files/" + fileName);
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferReader = new BufferedReader(fileReader);
		String text;
		if(bufferReader.ready()) {
			text = bufferReader.readLine();
		  System.out.println(text);
		};
		} catch (FileNotFoundException e) {} catch (IOException err) {};
	}
	public void writeFile(String text) {
		try {
		File file = new File("./com/sanek228/files/" + fileName);
    FileWriter fileWriter = new FileWriter(file);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(text + "\n");
    bufferedWriter.flush();
		bufferedWriter.close();
		System.out.println("Текст(" + text + ") был успешно записан в файл " + fileName + "!");
		} catch (IOException e) {};
	}
}