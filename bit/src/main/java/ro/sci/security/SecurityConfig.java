package ro.sci.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter  {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests().antMatchers("/","/register","/login/**").permitAll().anyRequest()
		.authenticated();
		http
			.formLogin().loginPage("/login").usernameParameter("email");
		http.csrf().disable();

	}
		
		
	
	
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		 auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	 }
	
}
