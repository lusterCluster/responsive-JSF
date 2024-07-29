package com.lusterc.jsfRookUI;

/**
 * Hello world!
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@AutoConfiguration
@ComponentScan({"com.lusterc.jsfRookUI"})
public class RookUI extends SpringBootServletInitializer {
    
    public static void main(String[] args) {
        SpringApplication.run(RookUI.class, args);
    }

    
}