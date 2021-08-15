package ru.gb.preparing_for_interview.lession_5;

import ru.gb.preparing_for_interview.lession_5.dao.StudentDao;
import ru.gb.preparing_for_interview.lession_5.entities.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentDao studentDAO = new StudentDao();

        for (int i = 0; i < 1000; i++) {
            studentDAO.saveOrUpdate(new Student("Student " + i, i));
        }

        System.out.println(studentDAO.findById(23L));

        List<Student> students = studentDAO.findAll();
        students.forEach(System.out::println);

        studentDAO.deleteById(23L);
        System.out.println(studentDAO.findById(23L));

        Student student = studentDAO.findById(24L);
        student.setMark(2);
        studentDAO.saveOrUpdate(student);
        System.out.println(studentDAO.findById(24L));
    }

}
