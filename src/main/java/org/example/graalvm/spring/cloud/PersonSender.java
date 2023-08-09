package org.example.graalvm.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static org.example.graalvm.spring.cloud.PersonStream.PERSON_OUT_TOPIC;

@Service("personSender")
public class PersonSender {

    @Autowired
    private StreamBridge streamBridge;

    @Scheduled(fixedRate = 4000, initialDelay = 1000)
    public void sendPerson() {
        Person person = new Person("Omer", "Celik");
        streamBridge.send(PERSON_OUT_TOPIC, MessageBuilder.withPayload(person).build());

    }
}
