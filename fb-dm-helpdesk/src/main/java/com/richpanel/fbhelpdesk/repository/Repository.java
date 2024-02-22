package com.richpanel.fbhelpdesk.repository;

import com.richpanel.fbhelpdesk.dto.UserDTO;

public interface Repository {
    void registerUser(UserDTO dto);
    UserDTO loginUser(String email,String password);
}
