package utils.person;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;


import java.util.Locale;

@Setter
@Getter
public class PersonGenerator {
    private Person person;
    private Faker faker;

    public PersonGenerator() {
        this.person = new Person();
        this.faker = new Faker(new Locale("en-US"));

    }

    public static PersonGenerator generateRandomPerson() {
        PersonGenerator personGenerator = new PersonGenerator();
        personGenerator.person.setFirstName(personGenerator.faker.name().firstName());
        personGenerator.person.setLastName(personGenerator.faker.name().lastName());
        personGenerator.person.setFullName(personGenerator.faker.name().fullName());
        personGenerator.person.setSex(personGenerator.faker.demographic().sex());
        return personGenerator;

    }

    public static PersonGenerator generateRandomLastName() {
        PersonGenerator personGenerator = new PersonGenerator();
        personGenerator.person.setLastName(personGenerator.faker.name().lastName());
        return personGenerator;
    }

    public static PersonGenerator generateRandomFirstName() {
        PersonGenerator personGenerator = new PersonGenerator();
        personGenerator.person.setFirstName(personGenerator.faker.name().firstName());
        return personGenerator;
    }
}
