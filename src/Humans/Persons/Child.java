package Humans.Persons;

import Humans.Human;
import Humans.HumanData;
import Humans.Sex;

public class Child extends Human {
    public Child(String name, Sex sex) {
        super(new HumanData(name, sex));
    }
}
