package com.example.demo.service;

import java.util.*;
import com.example.demo.entity.StudentEntity;

public interface StudentInterface {

    public StudentEntity createdata(StudentEntity stu);
    public List<StudentEntity> dataList();
}