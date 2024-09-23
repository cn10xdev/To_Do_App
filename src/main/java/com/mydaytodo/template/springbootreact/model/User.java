 package com.mydaytodo.template.springbootreact.model;

import java.util.List;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID  id;

    @Column(unique = true)
    @Email(message = "Please provide a valid email address")
    private String email;

    @Size(min = 8 ,max = 20,message = "password should be between 8 to 12 characters")
    private String password;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    @JsonManagedReference
    private List<Todo> todos;
}