package com.ng.ngmicrosrvices.cart_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.cors(c -> c.disable());
        http.csrf(c -> c.disable());
        http.authorizeHttpRequests(c -> c.anyRequest().authenticated());
        http.oauth2ResourceServer(c -> c.jwt(Customizer.withDefaults()));
        return http.build();
    }

}
