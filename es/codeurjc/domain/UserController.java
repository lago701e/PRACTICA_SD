package es.codeurjc.domain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
class UserController {
    private Map<String, User> userMap;

    public UserController() {
        userMap = new HashMap<>();
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registrationform.html";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        if (userMap.containsKey(user.getUsername())) {
            model.addAttribute("message", "El usuario ya existe");
        } else {
            userMap.put(user.getUsername(), user);
            model.addAttribute("message", "Usuario registrado exitosamente");
        }
        model.addAttribute("user", user);
        return "index.html";
    }
}
      //  org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AuthApplication.class);
      //  logger.error("Hola");
