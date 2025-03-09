package Humans.Persons;

import Humans.Human;
import Humans.HumanData;
import Humans.Sex;

public class Malish extends Human {
    public Malish() {
        super(new HumanData("Малыш", Sex.MALE));
    }

    public void behaveNaughty() {
        System.out.println(this.getHumanData().name() + " ведёт себя непослушно");
    }
}
