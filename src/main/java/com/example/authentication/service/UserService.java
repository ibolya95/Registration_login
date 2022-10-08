package com.example.authentication.service;

import com.example.authentication.model.User;
import com.example.authentication.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
