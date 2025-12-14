package fi.tamk.artemis_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ArtemisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtemisDemoApplication.class, args);
    }
}
