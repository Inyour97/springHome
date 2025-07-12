package com.example.account.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Manpage {
    @GetMapping("/main")
    public String main() {
        return "heardFooter";
    }
}
