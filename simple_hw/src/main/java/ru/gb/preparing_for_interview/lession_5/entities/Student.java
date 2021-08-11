package ru.gb.preparing_for_interview.lession_5.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "mark")
    private int mark;

    public Student(String fullName, int mark) {
        this.fullName = fullName;
        this.mark = mark;
    }
}
