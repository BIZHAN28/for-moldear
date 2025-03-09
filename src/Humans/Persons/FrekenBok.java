package Humans.Persons;

import Humans.Human;
import Humans.HumanData;
import Humans.Sex;

public class FrekenBok extends Human {
    public FrekenBok() {
        super(new HumanData("Фрекен Бок", Sex.FEMALE));
    }
    public void Torture(Malish malish) {
        System.out.println(this.getHumanData().name() + " мучает " + malish);
    }
}
