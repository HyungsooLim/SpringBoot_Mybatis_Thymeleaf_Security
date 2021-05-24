package com.hs.s1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		// Security를 무시하는 경로 설정
		web.ignoring()
			.antMatchers("/resources/**")
			.antMatchers("/images/**")
			.antMatchers("/css/**")
			.antMatchers("/js/**")
			.antMatchers("/vendor/**")
			.antMatchers("/favicon/**")
			;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		// "/"라는 주소가 들어오면 모든 Request를 허용하겠다.
			.authorizeRequests()
				.antMatchers("/")
					.permitAll()
				.antMatchers("/notice/list", "/notice/select")
					.permitAll()
				.antMatchers("/notice/**").hasRole("ADMIN")
					.anyRequest().authenticated()
//				// "/member"라는 주소가 들어오면 로그인한 사람만 허용
//				.antMatchers("/member")
//					.authenticated()
//				// "/admin"이라는 주소 들오면 ADMIN만 Request 허용
//				.antMatchers("/admin")
//					.hasRole("ADMIN")
				;
	}
	
}
