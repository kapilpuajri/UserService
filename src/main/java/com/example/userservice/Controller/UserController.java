package com.example.userservice.Controller;


import com.example.userservice.dto.*;
import com.example.userservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class UserController {

    private final AuthService authService;

    @PostMapping("/signup")
    public AuthResponseDTO signup(@RequestBody SignupRequestDTO request) {
        return authService.signup(request);
    }

    @PostMapping("/signin")
    public AuthResponseDTO signin(@RequestBody LoginRequestDTO request) {
        return authService.signin(request);
    }
}

