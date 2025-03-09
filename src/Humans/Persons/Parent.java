package Humans.Persons;

import Humans.Human;
import Humans.HumanData;
import Humans.Sex;

public class Parent extends Human {
    public Parent(String name, Sex sex) {
        super(new HumanData(name, sex));
    }

    public void love(Malish malish) {
        System.out.println(this.getHumanData().name() + " любит " + malish.getHumanData().name());
    }
}
