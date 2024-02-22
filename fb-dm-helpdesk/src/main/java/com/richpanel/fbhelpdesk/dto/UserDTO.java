package com.richpanel.fbhelpdesk.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users")
@NamedQuery( name = "login", query = "select dto from UserDTO dto where dto.email=:e and dto.password=:p")
public class UserDTO {
    @Id
    @GenericGenerator(name="ref", strategy="increment")
    @GeneratedValue(generator = "ref")
    private int userID;
    private String name;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "UserDTO{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
