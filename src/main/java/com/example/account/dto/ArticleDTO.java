package com.example.account.dto;

import com.example.account.entity.InputDetail;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleDTO {
    private String title;
    private String content;

    public InputDetail toEntity(){
        return new InputDetail(null,title,content);
    }
}