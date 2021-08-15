package ru.gb.preparing_for_interview.lession_5.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {

    public static SessionFactory get() {
        return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
}
