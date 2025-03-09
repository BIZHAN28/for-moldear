package Items;

import Humans.Human;

import java.util.ArrayList;
import java.util.List;

public class Storage extends Item {

    List<Item> items;
    public Storage(String name) {
        super(name);
        items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    @Override
    public void use(Human human) {
        System.out.println(human.getHumanData().name() + " открыл " + this.getName());
    }
}
