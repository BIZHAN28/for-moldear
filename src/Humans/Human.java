package Humans;

import Humans.Persons.Begay;
import Items.Clothes;
import Items.Item;
import Items.Storage;
import Location.Location;
import Location.GoToSameLocationException;

public abstract class Human {

    private HumanData humanData;

    public HumanData getHumanData() {
        return humanData;
    }

    public void setHumanData(HumanData humanData) {
        this.humanData = humanData;
    }

    public Human(HumanData humanData) {
        this.humanData = humanData;
    }

    public void expressEmo(Emotion emotion) {
        System.out.println(humanData.name() + " выражает эмоцию " + emotion);
    }

    public void detect(Human human) {
        System.out.println(this.humanData.name() + " обнаружил(-а) " + human.getHumanData().name());
    }

    public void goTo(Location fromLoc, Location toLoc) {
        for (int i = 0; i < toLoc.getVisitors().size(); i++) {
            if (this.equals(toLoc.getVisitors().get(i))) {
                throw new GoToSameLocationException("Персонаж не может прийти в локацию в которой он уже был");
            }
        }

        toLoc.addVisitor(this);
        fromLoc.removeVisitor(this);
        System.out.println(humanData.name() + " пошел(-а) в " + toLoc.getName());
    }

    public void whisper(Human human, String text) {
        System.out.println(this.humanData.name() + " нашептал(-а) " + human.getHumanData().name() + ": " + text);
    }

    public void speak(Human human, String text) {
        System.out.println(this.humanData.name() + " сказал(-а) " + human.getHumanData().name() + ": " + text);
    }

    public void wear(Clothes clothes) {
        clothes.use(this);
    }

    public void move(Item item) {
        System.out.println(this.humanData.name() + " передвинул(-а) " + item.getName());
    }

    public void lookAt(Item item) {
        System.out.println(this.humanData.name() + " посмотрел(-а) на " + item.getName());
    }

    public void openStorage(Storage storage) {
        storage.use(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Human) {
            return this.getHumanData().name().equals(((Human) o).getHumanData().name());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getHumanData().name().hashCode() + this.getHumanData().sex().hashCode();
    }

    @Override
    public String toString() {
        return this.getHumanData().name() + " " + this.getHumanData().sex();
    }

}
