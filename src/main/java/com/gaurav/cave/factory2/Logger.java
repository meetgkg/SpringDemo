package com.gaurav.cave.factory2;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * to illustrate constructor autowiring
 */
public class Logger {
	
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	/*@Autowired
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter){
		super();
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
		System.out.println("Logger Constructor");
	}*/
	
	public Logger(){
	}
	
	@Autowired(required=false)
	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}
	
	@Autowired
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
}
