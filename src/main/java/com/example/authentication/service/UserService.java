package com.example.authentication.service;

import com.example.authentication.model.User;
import com.example.authentication.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
