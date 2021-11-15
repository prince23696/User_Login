package com.UserLoginDemo.Service;

import com.UserLoginDemo.Dto.UserRegistrationDto;
import com.UserLoginDemo.Entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    public String ConsumeAPI();
}