package com.example.javabasic.day26.JWT.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	//Autorwired your JPA/MONGO repository
	//GetByh USerId

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("cgiuser".equals(username)) { //Here you have to call DB
			return new User(username,
					"$2a$10$R2NuUGeIudmBs1bgVGUMHO6mrRdMTCwSdtuqYY12.WbXA2fpxYTza",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}
