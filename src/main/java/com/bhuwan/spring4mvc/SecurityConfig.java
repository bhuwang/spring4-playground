/**
 * 
 */
package com.bhuwan.spring4mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author bhuwan
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login*", "/login-failed*").anonymous().anyRequest().hasRole("USER").and().formLogin()
				.loginPage("/login").defaultSuccessUrl("/").failureUrl("/login-failed").and().logout().logoutUrl("/logout")
				.logoutSuccessUrl("/login").invalidateHttpSession(true).deleteCookies("JSESSIONID").and().exceptionHandling()
				.accessDeniedPage("/access-denied");
	}

	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("user").password("password").roles("USER").build());
		manager.createUser(User.withUsername("normal").password("password").roles("NORMAL").build());
		return manager;
	}
}
