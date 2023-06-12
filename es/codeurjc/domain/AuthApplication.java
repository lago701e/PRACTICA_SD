package es.codeurjc.domain;

import ch.qos.logback.core.model.Model;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AuthApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AuthApplication.class, args);

        // Agregar usuarios de ejemplo
        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.addUser(new User("user1", "password1"));
        userRepository.addUser(new User("user2", "password2"));
    }
    @GetMapping("/laaogin")
    public String loginForm(Model model) {
        return "/index.html";
    }

    @GetMapping("/raaegister")
    public String registerForm(Model model) {
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AuthApplication.class);
        logger.error("Hola");
        return "/registrationform.html";
    }





}

