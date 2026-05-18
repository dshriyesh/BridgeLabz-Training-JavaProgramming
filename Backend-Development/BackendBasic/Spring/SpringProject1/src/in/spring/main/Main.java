package in.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class Main {

    public static void main(String[] args) {

        String config = "applicationContext.xml";
   
        ApplicationContext context = new ClassPathXmlApplicationContext(config);


        Student std = (Student) context.getBean("stdId");

        std.display();
    }
}