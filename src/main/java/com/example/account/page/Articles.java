package com.example.account.page;

import com.example.account.dto.ArticleDTO;
import com.example.account.entity.InputDetail;
import com.example.account.repository.InputRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class Articles {

    @Autowired
    private InputRepository inputRepository;

    @GetMapping("/Articles/new")
    public String Articles(){
        return "articles";
    }

    @PostMapping("/Articles/create")
    public String createArticle(ArticleDTO articleDTO) {

        InputDetail inputDetail=articleDTO.toEntity();
        InputDetail saved = inputRepository.save(inputDetail);

        return "";
    }

}
