package main;

import com.sf.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
            Student std1 = (Student)context.getBean("student");
            std1.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
