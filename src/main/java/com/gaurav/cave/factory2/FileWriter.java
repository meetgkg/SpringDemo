package com.gaurav.cave.factory2;
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write to file: " + text);
	}

}