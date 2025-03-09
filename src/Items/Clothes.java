package Items;

import Humans.Human;

public class Clothes extends Item {

    public Clothes(String name) {
        super(name);
    }

    @Override
    public void use(Human human) {
        System.out.println(human.getHumanData().name() + " надел " + this.getName());
    }
}
