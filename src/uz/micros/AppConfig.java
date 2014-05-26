package uz.micros;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

/**
 * Created by java on 26.05.14.
 */
@Configuration
@ComponentScan("uz.micros")
public class AppConfig {
    @Bean (name = "thymeleadImplv1.0")
    public Renderer getRenderer(){
        return new Renderer();
    }



}
