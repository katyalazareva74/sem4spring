package ru.example.hometask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Task2Controller {
    /**
     * Запрос выполняется с использованием параметров из запроса
     * @param model - модель Spring MVC
     * @param name - имя студента
     * @param lname - фамилия студента
     * @param special - специализация студента
     * @return - возвращает страницу с подставленными значениями переменных из запроса     */
    @GetMapping("/develop")
    public String studentData(Model model, @RequestParam("name") String name, @RequestParam("lname") String lname, @RequestParam("special") String special){
        model.addAttribute("name", name);
        model.addAttribute("lname", lname);
        model.addAttribute("special", special);
        return "develop";
    }
}
