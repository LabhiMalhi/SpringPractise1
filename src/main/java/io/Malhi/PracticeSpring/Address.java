package io.Malhi.PracticeSpring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Data
@AllArgsConstructor@Setter

public class Address {
    private String city;
    private String province;

    public Address() {

    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
