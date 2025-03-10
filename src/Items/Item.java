package Items;

import Humans.Human;

public abstract class Item {
    private final String name;
    public Item(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract void use(Human human);

    @Override
    public boolean equals(Object o) {
        if (o instanceof Item) {
            return this.name.equals(((Item) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}