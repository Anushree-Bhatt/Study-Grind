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
