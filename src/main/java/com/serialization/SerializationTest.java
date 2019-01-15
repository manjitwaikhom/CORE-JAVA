package com.serialization;

import java.io.IOException;

public class SerializationTest {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Hitesh");
		user.setUsername("Codingeek");
		user.setPassword("Garg");

		try {
			/**
			 * Serializing the object
			 */
			SerializationUtil.serialize(user, "serialization.txt");

			/**
			 * Deserializing the object
			 */
			User newUser = (User) SerializationUtil
					.deserialize("serialization.txt");
			System.out.println(newUser.toString());

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}