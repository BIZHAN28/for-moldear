import Club.Club;
import Humans.Emotion;
import Humans.Human;
import Humans.Persons.*;
import Humans.Sex;
import Items.Appliance;
import Items.Clothes;
import Items.Storage;
import Location.Location;

public class Main {
    public static void main(String[] args) {
        Pek pek = new Pek();
        FrekenBok frekenBok = new FrekenBok();
        Malish malish = new Malish();
        Karlson karlson = new Karlson();
        Begay begay = new Begay();
        Child child1 = new Child("ребёнок1", Sex.MALE);
        Child child2 = new Child("ребёнок2", Sex.FEMALE);
        Parent mother = new Parent("Мама", Sex.FEMALE);
        Parent father = new Parent("Отец", Sex.MALE);

        Appliance wires = new Appliance("провода");
        Appliance cameras = new Appliance("камеры");
        Storage box = new Storage("ящик");
        Clothes theatreCostume1 = new Clothes("театральный костюм 1");
        Clothes theatreCostume2 = new Clothes("театральный костюм 2");
        Clothes theatreCostume3 = new Clothes("театральный костюм 3");

        Location home = new Location("дом");
        Location work = new Location("работа");

        home.addVisitor(malish);
        home.addVisitor(frekenBok);
        home.addVisitor(pek);
        home.addVisitor(father);
        home.addVisitor(mother);

        home.addItem(wires);

        Club theatreClub;

        //История

        theatreClub = begay.createClub("театральный кружок");
        begay.joinClub(child1, theatreClub);
        begay.joinClub(child2, theatreClub);
        theatreClub.makeClubActivity();

        begay.store(theatreCostume1, box);
        begay.store(theatreCostume2, box);
        begay.store(theatreCostume3, box);

        father.goTo(home, work);
        mother.goTo(home, work);

        malish.behaveNaughty();
        karlson.behaveNaughty();
        malish.move(wires);
        karlson.move(cameras);

        pek.expressEmo(Emotion.SMILE);
        frekenBok.expressEmo(Emotion.BLUSH);
        malish.expressEmo(Emotion.BLUSH);

        pek.detect(karlson);
        malish.lookAt(box);
        malish.openStorage(box);
        malish.whisper(karlson, "прячься");
        karlson.hide(box);

        mother.goTo(home, home);
        father.goTo(home, home);

        father.lookAt(wires);
        mother.lookAt(cameras);

    }
}