package pl.raziel.spring.implementations;

import pl.raziel.spring.api.Logger;

import java.util.Date;

public class LoggerImpl implements Logger {
	private String name;
	private int version;

	public void log(String message) {
		System.out.println(new Date() + " [" + name + " v." + version + "]: " + message);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
