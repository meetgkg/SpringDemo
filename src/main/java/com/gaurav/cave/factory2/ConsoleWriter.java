package com.gaurav.cave.factory2;

public class ConsoleWriter implements LogWriter{

	public void write(String text) {
		System.out.println("Write to console: " + text);
	}
}
