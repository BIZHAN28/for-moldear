package Items;

import Humans.Human;

public class Props extends Item {

    public Props(String name) {
        super(name);
    }

    @Override
    public void use(Human human) {
        System.out.println(human.getHumanData() + " использовал " + this.getName());
    }
}
