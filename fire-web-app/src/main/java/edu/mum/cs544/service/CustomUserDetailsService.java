package edu.mum.cs544.service;

import edu.mum.cs544.domain.Authority;
import edu.mum.cs544.domain.AuthorityType;
import edu.mum.cs544.domain.CustomUserDetails;
import edu.mum.cs544.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        final User user = new User();
        user.setUsername("admin");
        user.setPassword("$2a$10$/DrzEJD403PbxZ.99R0Ru.K125d9DzXQtEPw4U1rNU7SqIR0HGBxi");
        user.addRole( new Authority(AuthorityType.ROLE_ADMIN));
        user.addRole( new Authority(AuthorityType.ROLE_USER));
        return new CustomUserDetails(user);
    }
}
