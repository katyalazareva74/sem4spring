package ru.example.hometask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class Task1Controller {
    /**
     * Этот запрос будет выполняться, если в проекте отключен Thymeleaf.
     * @return - возвращает статическую станиичку hello.html по адресу: http://localhost:8080/hello
     */
    @GetMapping
    public String sayHello(){
        return "hello.html";
    }
}
