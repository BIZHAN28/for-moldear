package Humans.Persons;

import Club.Club;
import Club.Clubbable;
import Humans.Human;
import Humans.HumanData;
import Humans.Sex;
import Items.Item;
import Items.Storage;
import Location.Location;

import java.util.Objects;

public class Begay extends Human implements Clubbable {

    public Begay() {
        super(new HumanData("Бегай", Sex.FEMALE));
    }

    @Override
    public Club createClub(String name) {
        System.out.println(this.getHumanData().name() + " создал(-а) клуб " + name);
        Club club = new Club(name);
        club.addParticipant(this);
        return club;
    }

    @Override
    public void joinClub(Human human, Club club) {
        System.out.println(this.getHumanData().name() + " добавил(-а) " + human.getHumanData().name() + " в клуб " + club.getName());
        club.addParticipant(human);
    }

    public void store(Item item, Storage storage) {
        System.out.println(this.getHumanData().name() + " положил(-а) " + item.getName() + " в " + storage.getName());
        storage.addItem(item);
    }
}
