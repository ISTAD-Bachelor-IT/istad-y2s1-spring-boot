package dev.oudom.sbapp.javabean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaBeanConfig {

    @Bean
    public JavaBean javaBean1() {
        JavaBean javaBean = new JavaBean();
        javaBean.setId("ISTAD-B01");

        return javaBean;
    }

    @Primary
    @Bean
    public JavaBean javaBean2() {
        JavaBean javaBean = new JavaBean();
        javaBean.setId("ISTAD-B02");

        return javaBean;
    }
}
