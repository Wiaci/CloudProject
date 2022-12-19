package wiaci.proj.musixearch.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import wiaci.proj.musixearch.dto.UserInfo;

@Controller
public class LoginController {

    @GetMapping(name = "/register")
    public String registerPage(Model model) {
        model.addAttribute("userinfo", new UserInfo());
        return "register";
    }

    @PostMapping(name = "register")
    public String registerUser(Model model) {

    }

}
