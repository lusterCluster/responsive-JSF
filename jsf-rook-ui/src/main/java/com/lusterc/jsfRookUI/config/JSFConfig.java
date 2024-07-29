package com.lusterc.jsfRookUI.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.jsf.el.SpringBeanFacesELResolver;

import jakarta.faces.webapp.FacesServlet;
@Configuration
public class JSFConfig {
    @Bean
    public ServletRegistrationBean<FacesServlet> facesServletRegistration() {
        ServletRegistrationBean<FacesServlet> registration = new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
        registration.setName("RookUIServlet");
        registration.setLoadOnStartup(1);
        return registration;
    }

    @Bean
    public SpringBeanFacesELResolver springBeanFacesELResolver() {
        return new SpringBeanFacesELResolver();
    }
}