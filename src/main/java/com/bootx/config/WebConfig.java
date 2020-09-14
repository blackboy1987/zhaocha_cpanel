package com.bootx.config;

import com.bootx.interceptor.CorsInterceptor;
import com.bootx.miniprogram.interceptor.AppValidateInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public CorsInterceptor corsInterceptor() {
        return new CorsInterceptor();
    }

    @Bean
    public AppValidateInterceptor appValidateInterceptor () {
        return new AppValidateInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsInterceptor())
                .addPathPatterns("/**");
        registry.addInterceptor(appValidateInterceptor())
                .addPathPatterns("/**");

    }

}
