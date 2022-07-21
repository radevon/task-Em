package com.beloil.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
//@MapperScan(basePackages ="com.beloil.spring.dao")
//@ComponentScan(basePackages = { "com.beloil.spring" }, excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Configuration.class)})
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	 
	@Autowired
	private UserServiceSecurity userService;

	    @Bean
	    public BCryptPasswordEncoder bCryptPasswordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    	
	        http.csrf().disable()
	        .authorizeRequests()
	                    //Доступ только для не зарегистрированных пользователей
	        .antMatchers("/login").permitAll()
	        //.antMatchers("/api/*").permitAll()  // раскомментировать для добавления тестового пользователя
	                    // Доступ разрешен всем к статике
	        .antMatchers("/resources/**").permitAll() 
	                //Все остальные страницы требуют аутентификации
	        .anyRequest().authenticated()
	                .and()
	        //Настройка для входа в систему
	                    .formLogin()
	                    .loginPage("/login")
	                    .defaultSuccessUrl("/", true)
	    				//.permitAll()
	    				.and()
	    				.logout();
	                    
	    }

	   	    
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder());
	    }
}
