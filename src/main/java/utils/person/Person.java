package utils.person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private String nameWithMiddle;
    private String fullName;
    private String prefix;
    private String suffix;
    private String title;
    private String username;
    private String sex;
    private String maritalStatus;
    private String company;
    private String address;
    private String medical;
    private String country;
}
