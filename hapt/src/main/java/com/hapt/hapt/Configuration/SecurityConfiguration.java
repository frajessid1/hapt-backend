package com.hapt.hapt.Configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configAuthentification(AuthenticationManagerBuilder autho) throws Exception{
        autho.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder()).dataSource(dataSource)
                .usersByUsernameQuery("SELECT email,password,active FROM hapt.user where email=?")
                .authoritiesByUsernameQuery("SELECT email,user_role FROM hapt.user where email=?");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","/formation-organisation","/formation-marketing","/formation-management"
                        ,"/formation-intra-II","/formation-intra","/formation-interII","/formation-infographie-sousse"
                        , "/home","/contact","/inscription","/formation-achat-vente","/formation-inter"
                        ,"/css/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                //loginpage formulaire
                .loginPage("/login").usernameParameter("email").passwordParameter("password")
                //fail conncetion
                .failureUrl("/login?error")
                //success connection
                .defaultSuccessUrl("/home")
                //denied access
                .and().exceptionHandling().accessDeniedPage("/deniedaccess")
                .and()
                //logout setting and action
                .logout().invalidateHttpSession(true).clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login?logout")
                .permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("user")
                        .password("password")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}