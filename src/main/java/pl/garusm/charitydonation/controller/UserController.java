package pl.garusm.charitydonation.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.garusm.charitydonation.entity.User;

@Controller
public class UserController {

    @GetMapping("/register")
    public String registerUser(Model model){
        model.addAttribute("user", new User());
        return "/register";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin2(@AuthenticationPrincipal UserDetails customUser) {
        return "this is user " + customUser;
    }
}
