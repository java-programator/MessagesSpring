package pl.altkom.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("META-INF/beans.xml")
@Configuration
public class SpringModule {
    @Bean("mail-from-java")
    public Mail getMail() {
        return new Mail(new Message("a", "b"), 99);
    }

    @Bean("to-field")
    public String getTo() {
        return "pawel";
    }

    @Bean("text-field")
    public String getText() {
        return "Kocham Jave";
    }

    @Bean("simple-message")
    public Message getSimpleMessage(@Qualifier("to-field") String a,
                                    @Qualifier("text-field") String b) {
        return new Message(a, b);
    }
}
