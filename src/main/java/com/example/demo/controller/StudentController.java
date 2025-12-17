package com.example.demo.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentInterface;

@RestController
public class StudentController{

    @Autowired
    StudentInterface ser;

    @PostMapping("/newdata")
    public StudentEntity createdata(@RequestBody StudentEntity stu){
        return ser.createdata(stu);
    }

    @GetMapping("/getdata")
    public List<StudentEntity> dataList(){
        return ser.dataList();
    }

    @GetMapping("getdatabyid/{id}")
    public Optional<StudentEntity> fetchdataById(@PathVariable int id){
        return ser.fetchdataById(id);
    }
}