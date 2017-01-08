package com.serialization;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * Generated Serial version Id
	 */
	private static final long serialVersionUID = -55857686305273843L;

	private String name;
	private String username;
	transient private String password;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String value = "name : " + name + "\nUserName : " + username
				+ "\nPassword : " + password;
		return value;
	}

	/**
	 * Setters and getters methods.
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}