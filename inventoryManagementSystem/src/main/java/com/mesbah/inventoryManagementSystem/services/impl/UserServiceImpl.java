package com.mesbah.inventoryManagementSystem.services.impl;

import com.mesbah.inventoryManagementSystem.dtos.LoginRequest;
import com.mesbah.inventoryManagementSystem.dtos.RegisterRequest;
import com.mesbah.inventoryManagementSystem.dtos.Response;
import com.mesbah.inventoryManagementSystem.dtos.UserDTO;
import com.mesbah.inventoryManagementSystem.enums.UserRole;
import com.mesbah.inventoryManagementSystem.models.User;
import com.mesbah.inventoryManagementSystem.repositories.UserRepository;
import com.mesbah.inventoryManagementSystem.security.JwtUtils;
import com.mesbah.inventoryManagementSystem.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final JwtUtils jwtUtils;

    @Override
    public Response registerUser(RegisterRequest registerRequest) {
        UserRole role = UserRole.MANAGER;
        if (registerRequest.getPassword() != null) {
            role = registerRequest.getRole();
        }
        User userToSave = User.builder()
                .name(registerRequest.getName())
                .email(registerRequest.getEmail())
                .password(registerRequest.getPassword())
                .role(role)
                .build();
        userRepository.save(userToSave);
        return Response.builder()
                .status(200)
                .message("User was succesfully registered")
                .build();
    }

    @Override
    public Response loginUser(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public Response getAllUsers() {
        return null;
    }

    @Override
    public Response getUserById(Long id) {
        return null;
    }

    @Override
    public User getCurrentLoggedInUser() {
        return null;
    }

    @Override
    public Response updateUser(Long is, UserDTO userDTO) {
        return null;
    }

    @Override
    public Response deleteUser(Long id) {
        return null;
    }

    @Override
    public Response getUserTransactions(Long id) {
        return null;
    }
}
