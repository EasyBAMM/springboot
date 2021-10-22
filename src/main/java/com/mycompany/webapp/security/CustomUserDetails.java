package com.mycompany.webapp.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUserDetails extends User {
	private static final long serialVersionUID = 1L;
	private String useremail;

	public CustomUserDetails(String username, String password, boolean menabled,
			Collection<? extends GrantedAuthority> authorities, String useremail) {
		super(username, password, menabled, true, true, true, authorities);
		this.useremail = useremail;
	}

	public String getUseremail() {
		return useremail;
	}

}
