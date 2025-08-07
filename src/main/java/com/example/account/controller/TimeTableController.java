package com.example.account.controller;

import com.example.account.dto.SubjectsDAO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TimeTableController {

    private final SubjectsDAO dao;

    public TimeTableController() {
        this.dao = new SubjectsDAO(); // 직접 생성
    }

    @GetMapping("/timetable")
    public Map<String, String> getTimeTable() {
        return dao.getTimeTable();
    }
}
