package com.app;

import com.config.AppConfig;
import com.dao.UserDao;
import com.model.User;
import com.ride.Drivable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Drivable drivable = context.getBean(Drivable.class);

        System.out.println(drivable.drive());

        UserDao repo = context.getBean(UserDao.class);

        System.out.println(repo.list());

        System.out.println("ALL OUT");

        User userToSave = new User();
        userToSave.setName("Leo");
        userToSave.setEmail("leo@mail.ru");
        repo.save(userToSave);

        System.out.println(repo.list());
    }
}
