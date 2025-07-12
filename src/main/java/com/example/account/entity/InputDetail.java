package com.example.account.entity;

import jakarta.persistence.*;

@Entity
public class InputDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    public InputDetail(){

    }

    public InputDetail(Long id,String title,String content){
        this.id=id;
        this.title=title;
        this.content=content;
    }
}
