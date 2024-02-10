package ru.example.hometask.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    /**
     * Без геттеров и сеттеров, так как используется lombok
     */
    private String name;
    private String lname;
    private String special;
}
