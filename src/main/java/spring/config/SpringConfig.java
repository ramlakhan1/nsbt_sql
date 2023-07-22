package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
//Dispatcher Servlet - Front Controller
@Configuration
@ComponentScan("spring") //they will be automatically findout
@EnableWebMvc // WebApplicationAnnotationConfigContext
@EnableAspectJAutoProxy
public class SpringConfig {
    @Bean
    public InternalResourceViewResolver getResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
