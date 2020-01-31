package com.example.mylog;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Christian Tzolov
 */
@ConfigurationProperties("my")
public class MyLogProperties {
	private String dugong;

	public String getDugong() {
		return dugong;
	}

	public void setDugong(String dugong) {
		this.dugong = dugong;
	}
}
