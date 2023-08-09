package org.example.graalvm.spring.cloud;

import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service("listenPersonData")
public class PersonListener implements Consumer<Person> {

    @Override
    public void accept(Person person) {
        System.out.println("Person Received : " + person.getName());
    }
}
