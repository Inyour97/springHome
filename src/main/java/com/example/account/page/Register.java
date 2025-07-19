package com.example.account.page;

import com.example.account.entity.InputDetail;
import com.example.account.repository.InputRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class Register {

    private final InputRepository inputRepository;

    @GetMapping("/register/{userId}")
    public String userOutputContent(@PathVariable Long userId, Model model){
        InputDetail inputDetail = inputRepository.findById(userId).orElse(null);
        model.addAttribute("articles", inputDetail);
        return "show";

    }

    @GetMapping("/register/all")
    public String userOutputContentAll(Model model){
        Iterable<InputDetail> allInput = inputRepository.findAll();
        model.addAttribute("articles", allInput);
        return "show";

    }

    @PostMapping("/register/delete/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        inputRepository.deleteById(userId);
        log.info("Deleted user id={}", userId);
        return "redirect:/register/all";
    }
}
