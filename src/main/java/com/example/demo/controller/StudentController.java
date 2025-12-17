package.com.example.demo.controller

import java.util.*;
import org.springframework.beans.factory.annotation.autowired;
import org.springframework.web.bind.*;
import com.example.demo.StudentEntity;
import com.example.demo.StudentInterface;

@RestController
public class StudentController{

    @Autowired
    StudentInterface ser;

    @PostMapping("/newdata")
    public StudentEntity createdata(StudentEntity stu){
        ser.createdata(stu);
    }

    @GetMapping("/getdata")
    public List<StudentEntity> dataList(){
        return ser.dataList();
    }
}