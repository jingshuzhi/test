package com.example.demo.clas;

import com.adc.da.util.utils.SwaggerUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Confing {
    @Bean
    public Docket docket(){
        return SwaggerUtils.initDocket();
    }

}
