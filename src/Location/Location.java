package Location;

import Humans.Human;
import Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private List<Item> storedItems;
    private List<Human> visitors;

    public Location(String name, List<Item> storedItems, List<Human> visitors) {
        this.name = name;
        this.storedItems = storedItems;
        this.visitors = visitors;
    }
    public Location(String name) {
        this.name = name;
        this.storedItems = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }
    public List<Item> getStoredItems() {
        return storedItems;
    }

    public List<Human> getVisitors() {
        return visitors;
    }

    public void addItem(Item item) {
        storedItems.add(item);
    }

    public void removeItem(Item item) {
        storedItems.remove(item);
    }

    public void addVisitor(Human visitor) {
        visitors.add(visitor);
    }
    public void removeVisitor(Human visitor) {
        visitors.remove(visitor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
