package com.example.demo.service.servicelogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentInterface;
import java.util.*;

@Service
public class StudentService implements StudentInterface{

    @Autowired
    StudentRepository repo;

    @Override
    public StudentEntity createdata(StudentEntity stu){
        return repo.save(stu);
    }
    @Override
    public List<StudentEntity> dataList(){
        return repo.findAll();
    }@Override
    public Optional<StudentEntity>  fetchdataById(int id){
        return repo.findById(id);
    }
}