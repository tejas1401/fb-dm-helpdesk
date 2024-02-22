package com.richpanel.fbhelpdesk.service.impl;

import com.richpanel.fbhelpdesk.dto.UserDTO;
import com.richpanel.fbhelpdesk.repository.Repository;
import com.richpanel.fbhelpdesk.service.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@org.springframework.stereotype.Service
public class ServiceIMPL implements Service {
    @Autowired
    private Repository repository;

    @Override
    public void validateRegisterUser(UserDTO dto) {
        repository.registerUser(dto);
    }

    @Override
    public UserDTO validateLoginUser(String email, String password) {
        return repository.loginUser(email,password);
    }
}
