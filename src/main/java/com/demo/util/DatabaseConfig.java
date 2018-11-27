package com.demo.util;

import java.util.ResourceBundle;

public class DatabaseConfig {
	private final static ResourceBundle bundle = ResourceBundle.getBundle("database");
	private String url;
	private String password;
	private String username;

	public DatabaseConfig() {
		this.url = bundle.getString("jdbc.url");
		this.username = bundle.getString("jdbc.username");
		this.password = bundle.getString("jdbc.password");
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
