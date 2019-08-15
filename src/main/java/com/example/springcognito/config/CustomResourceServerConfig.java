package com.example.springcognito.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


@Configuration
//@EnableResourceServer
public class CustomResourceServerConfig extends ResourceServerConfigurerAdapter{

    @Override
    public void configure(HttpSecurity http) throws Exception {
    	http.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"**").permitAll()
                .antMatchers("/api/v2/api-docs","/swagger-ui.html","/swagger-ui.html/**","/webjars/**","/v2/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/security").permitAll()
			.anyRequest()
				.authenticated()
                .and().oauth2ResourceServer().jwt();
                
    }
 
}
