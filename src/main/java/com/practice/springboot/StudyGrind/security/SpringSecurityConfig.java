package com.practice.springboot.StudyGrind.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class SpringSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager(){
        User.UserBuilder user=  User.withDefaultPasswordEncoder();
        UserDetails userDetails = user
                                .username("anushree")
                                .password("anu@123")
                                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }

//    // as password prefixAlternate-way - to use {noop}
//    @Bean
//    public InMemoryUserDetailsManager createUserDetailsManager(){
//        User.UserBuilder user=  User.builder();
//        UserDetails userDetails = user
//                .username("anushree")
//                .password("{noop}anu@123")
//                .build();
//
//        return new InMemoryUserDetailsManager(userDetails);
//    }

}
