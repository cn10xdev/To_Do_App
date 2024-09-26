package com.mydaytodo.template.springbootreact.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        return http
                .formLogin(formLogin -> formLogin.loginPage("/login").permitAll())
                .oauth2Login(oauth2 -> oauth2.defaultSuccessUrl("/welcome", true))
                .authorizeHttpRequests(c -> c.anyRequest().authenticated())
                .build();
    }
}
