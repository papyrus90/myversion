package ro.sci.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



import ro.sci.domain.User;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	SqlService dao;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = dao.getUserByEmail(email);
		if (user ==null){
			 throw new UsernameNotFoundException("could not find user with email : " + email);
		}
			
		return new CustomUserDetails(user);
	}
	
	public class CustomUserDetails extends User implements UserDetails{
		
		private CustomUserDetails(User user){
			super(user);
		}
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUsername() {
			return getEmail();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}
		@Override
		public boolean isEnabled() {
			return true;
		}
		
	}
	
}
