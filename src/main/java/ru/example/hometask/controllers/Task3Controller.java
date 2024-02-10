package ru.example.hometask.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.example.hometask.domain.Student;
import ru.example.hometask.servaice.StudentService;

import java.util.List;

@Controller
@AllArgsConstructor
public class Task3Controller {
    /**
     * Без конструктора, так как используется lombok
     */
    private StudentService service;

    /**
     * Запрос выдает весь список зарегистрированных студентов
     * @param model модель Spring MVC
     * @return возвращает список студентов
     */
    @GetMapping("/students")
    public String getAllStudent(Model model){
        List<Student> students = service.findAll();
        model.addAttribute("students", students);
        return "student";
    }

    /**
     * Запрос добавляет студента в список студентов и выдает список студентов
     * @param model можель Spring MVC
     * @param student
     * @return - возвращает обновленный список студентов
     */
    @PostMapping("/students")
    public String addStudent(Model model, Student student){
        service.addStudent(student);
        List<Student> students = service.findAll();
        model.addAttribute("students", students);
        return "student";
    }
}
