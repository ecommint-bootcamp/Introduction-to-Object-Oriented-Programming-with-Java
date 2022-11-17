package org.javaturk.rest.greet.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting{

	private String language;
	private String greeting;
	
	public Greeting() {
	}

	public Greeting(String language, String greeting) {
		this.language = language;
		this.greeting = greeting;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String toString() {
		return "Greeting [language=" + language + ", greeting=" + greeting + "]";
	}
}
