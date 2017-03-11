package com.sonata.practise.service;

import org.springframework.stereotype.Service;;

@Service
public class UserService {

	public int add(int a, int b) {
		return a + b;
	}

	public Boolean isUserExist(String email) {
		if ("testdsf@gmail.com".equalsIgnoreCase(email))
			return true;
		else
			return false;
	}
}
