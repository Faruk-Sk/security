package org.security.demo.security.secure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        	.antMatchers("/login").permitAll()
         .antMatchers("/dashboard").hasIpAddress("192.168.43.34")
//          .antMatchers(" /dashboard").hasIpAddress("192.168.43.34")
//          .antMatchers("/dashboard").hasIpAddress("255.255.255.0")
//          .antMatchers("/dashboard").permitAll()
          .anyRequest().authenticated()
          .and()
          .csrf().disable();
    }


}