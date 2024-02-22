package com.richpanel.fbhelpdesk.service;

import com.richpanel.fbhelpdesk.dto.UserDTO;

public interface Service {
void validateRegisterUser(UserDTO dto);
UserDTO validateLoginUser(String email,String password);
}
