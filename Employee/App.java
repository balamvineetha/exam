package Exam.Exam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("configure.xml");
       System.out.println(context.getBean(Student.class));

       System.out.println("-----------------------------");
       //ApplicationContext context1=new ClassPathXmlApplicationContext("config.xml");
       	System.out.println(context.getBean(Employee.class));
       
    }
}
