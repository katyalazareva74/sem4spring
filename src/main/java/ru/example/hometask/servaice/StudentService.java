package ru.example.hometask.servaice;

import org.springframework.stereotype.Service;
import ru.example.hometask.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> findAll(){
        return students;
    }
}
