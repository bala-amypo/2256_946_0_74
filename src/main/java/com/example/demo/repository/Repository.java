package.com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.exaple.demo.entity.StudentEntity;

public interface Repository extends JpaRepository<StudentEntity,Integer>{
    
}