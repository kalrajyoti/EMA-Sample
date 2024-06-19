package org.example;

import lombok.var;
import org.testng.annotations.Test;

import static utils.person.PersonGenerator.generateRandomPerson;

public class RandomPersonGenerationTest {

    @Test
    public void generateRandomPersonData(){
       var PersonGenerator= generateRandomPerson();
        System.out.println(PersonGenerator.getPerson().getFullName());
    }
}
