package com.app.vocation.Service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface MyUserDetailsService extends UserDetailsService {
    PasswordEncoder getEncoder();

}
