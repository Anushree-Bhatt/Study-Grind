package com.practice.springboot.StudyGrind.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.function.Function;

@Component
public class SpringSecurityConfig {


    @Bean
    protected InMemoryUserDetailsManager createUserDetailsManager(){
        Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
        UserDetails userDetails1 = User.builder().passwordEncoder(passwordEncoder)
                                .username("user")
                                .password("user@123")
                                .roles("USER")
                                .build();

        UserDetails userDetails2 = User.builder()
                                .passwordEncoder(passwordEncoder)
                                .username("admin")
                                .password("admin@123")
                                .roles("ADMIN")
                                .build();

        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }

//    //Alternate way of doing
//    @Bean
//    protected InMemoryUserDetailsManager createUserDetailsManager(){
//        UserDetails userDetails1 = User.builder()
//                .username("user")
//                .password(passwordEncoder().encode("user@123"))
//                .roles("USER")
//                .build();
//
//        UserDetails userDetails2 = User.builder()
//                .username("admin")
//                .password(passwordEncoder().encode("admin@123"))
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
//    }



    @Bean
    protected PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
