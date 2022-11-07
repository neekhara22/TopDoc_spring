package com.app.topdoc.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

/* @Author("Gokul Kumar R"), @CreateDate("30 may 2022"),
    @Description("To handle web security configuration") */
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends
        WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().xssProtection();
        http.headers().cacheControl();
        http.headers().httpStrictTransportSecurity();
        http.headers().frameOptions();
        http.headers().addHeaderWriter(new StaticHeadersWriter("X-Content-Security-Policy","script-src 'unsafe-inline' 'unsafe-eval'"));
        http.cors().disable();
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/**").permitAll();

    }
}
