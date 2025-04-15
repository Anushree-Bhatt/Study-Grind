package com.practice.springboot.StudyGrind.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.function.Function;

@Component
public class SpringSecurityConfig {


    @Bean
    protected InMemoryUserDetailsManager createUserDetailsManager(){

        UserDetails userDetails1 = createUserDetails("anushree", "anu@123", "USER");
        UserDetails userDetails2 = createUserDetails("sam", "sam@123", "USER");
        UserDetails userDetails3 = createUserDetails("admin", "admin@123", "ADMIN");

        return new InMemoryUserDetailsManager(userDetails1, userDetails2, userDetails3);
    }

    private UserDetails createUserDetails(String username, String password, String role) {
        Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
        UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder)
                                .username(username)
                                .password(password)
                                .roles(role)
                                .build();
        return userDetails;
    }

    //All URLs are protected
    //Login form for unauthorized access
    //Disable CSRF
    //Enable FrameOptions - as h2-console uses it.
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        httpSecurity.formLogin(Customizer.withDefaults());
        httpSecurity.csrf(AbstractHttpConfigurer::disable);
        httpSecurity.headers(header -> header.frameOptions(frame -> frame.disable()));
        return httpSecurity.build();

    }

    @Bean
    protected PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
