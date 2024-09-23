package com.mydaytodo.template.springbootreact.dao;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @Column(unique = true)
    @Email(message = "Please provide a valid email address")
    private String email;

}
