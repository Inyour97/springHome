package com.example.account.dto;

import com.example.account.entity.InputDetail;

public class ArticleDTO {
    private String title;
    private String content;

    public ArticleDTO() {}

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public ArticleDTO(String title,String content){
        this.title=title;
        this.content=content;
    }
    public InputDetail toEntity(){
        return new InputDetail(null,title,content);
    }
}