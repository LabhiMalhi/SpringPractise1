package io.Malhi.PracticeSpring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Setter
@Getter
@Data

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> hobies;
    private Map<String, Address> address;


    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobies=" + hobies +
                ", address=" + address +
                '}';
    }
}

