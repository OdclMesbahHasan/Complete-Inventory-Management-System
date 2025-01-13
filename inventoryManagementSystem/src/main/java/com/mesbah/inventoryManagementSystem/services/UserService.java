package com.mesbah.inventoryManagementSystem.services;

import com.mesbah.inventoryManagementSystem.dtos.LoginRequest;
import com.mesbah.inventoryManagementSystem.dtos.RegisterRequest;
import com.mesbah.inventoryManagementSystem.dtos.Response;
import com.mesbah.inventoryManagementSystem.dtos.UserDTO;
import com.mesbah.inventoryManagementSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUserById(Long id);
    User getCurrentLoggedInUser();
    Response updateUser(Long is, UserDTO userDTO);
    Response deleteUser(Long id);
    Response getUserTransactions(Long id);
}
