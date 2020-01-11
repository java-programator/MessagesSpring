package pl.altkom.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("META-INF/beans.xml");

        Message m1 = context.getBean("pawel", Message.class);

        System.out.println(m1.toString());

        Message m2 = context.getBean("adam", Message.class);
        System.out.println(m2);

        Mail mail1 = context.getBean("mail01", Mail.class);
        System.out.println(mail1);
    }
}
