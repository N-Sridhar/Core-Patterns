package com.sri.patterns.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

	private static volatile Logger instance;

	private Logger() {
	}

	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}

	public static void log(String message) {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
