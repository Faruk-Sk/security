//package org.security.demo.security.secure;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.WebAuthenticationDetails;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SecuritySconfig implements AuthenticationProvider {
//
//	Set<String> whitelist = new HashSet<String>();
//
//	public SecuritySconfig() {
////		whitelist.add("fe80::e6a7:c5ff:fe40:1af2%15");
////		whitelist.add("255.255.255.0");
////		whitelist.add(" 192.168.43.1");
//		whitelist.add("0.0.0.0");
//	}
//
//	@Override
//	public Authentication authenticate(Authentication auth) throws AuthenticationException {
//
//		WebAuthenticationDetails details = (WebAuthenticationDetails) auth.getDetails();
//		String userIp = details.getRemoteAddress();
//
//		if (!whitelist.contains(userIp)) {
//			throw new BadCredentialsException("Invalid IP Address");
//		}
//		return auth;
//	}
//
//	@Override
//	public boolean supports(Class<?> authentication) {
//		// TODO Auto-generated method stub
//		return true;
//	}
//}
