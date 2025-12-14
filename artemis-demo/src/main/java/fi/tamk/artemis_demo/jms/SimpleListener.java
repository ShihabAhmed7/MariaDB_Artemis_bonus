package fi.tamk.artemis_demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleListener {

    @JmsListener(destination = "${app.topic}")
    public void receive(String message) {
        System.out.println("🔥 BONUS Artemis received: " + message);
    }
}
