package Humans.Persons;

import Humans.Human;
import Humans.HumanData;
import Humans.Sex;
import Items.Storage;

public class Karlson extends Human {
    public Karlson() {
        super(new HumanData("Карлсон", Sex.MALE));
    }
    public void fly() {
        System.out.println(this.getHumanData().name() + " летает");
    }

    public void behaveNaughty() {
        System.out.println(this.getHumanData().name() + " ведёт себя непослушно");
    }
    public void hide(Storage storage) {
        System.out.println(this.getHumanData().name() + " спрятался в " + storage.getName());
    }
}
