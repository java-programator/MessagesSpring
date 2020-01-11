package pl.altkom.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringModule.class);
        context.refresh();

        Message m1 = context.getBean("pawel", Message.class);

        System.out.println(m1.toString());

        Message m2 = context.getBean("adam", Message.class);
        System.out.println(m2);

        Mail mail1 = context.getBean("mail01", Mail.class);
        System.out.println(mail1);

        Mail mail02 = context.getBean("mail-from-java", Mail.class);
        System.out.println(mail02.toString());

        Message m3 = context.getBean("simple-message", Message.class);
        System.out.println(m3);
    }
}
