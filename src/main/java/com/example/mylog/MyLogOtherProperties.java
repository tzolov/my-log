package com.example.mylog;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Christian Tzolov
 */
@ConfigurationProperties("other")
public class MyLogOtherProperties {
	private String orca;

	public String getOrca() {
		return orca;
	}

	public void setOrca(String orca) {
		this.orca = orca;
	}
}
