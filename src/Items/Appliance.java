package Items;

import Humans.Human;

public class Appliance extends Item {

    public Appliance(String name) {
        super(name);
    }

    @Override
    public void use(Human human) {
        System.out.println(human.getHumanData() + " использовал " + this.getName());
    }
}
