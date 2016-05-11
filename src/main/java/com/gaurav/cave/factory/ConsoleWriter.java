package com.gaurav.cave.factory;

public class ConsoleWriter implements LogWriter{

	public void write(String text) {
		System.out.println("Write to console: " + text);
	}
}
