package com.briankimathi.notekeeper.service;

import com.briankimathi.notekeeper.repository.UserRepository;
import com.briankimathi.notekeeper.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public UserService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public String register() {
        return "Registration works!!";
    }

    public String login() {
        return "Login works!!";
    }

}
