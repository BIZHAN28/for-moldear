package Club;

import Humans.Human;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private List<Human> participants;
    private String name;
    public Club(String name, List<Human> participants) {
        this.name = name;
        this.participants = participants;
    }
    public Club(String name) {
        this.name = name;
        this.participants = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Human> getParticipants() {
        return participants;
    }
    public void setParticipants(List<Human> participants) {
        this.participants = participants;
    }
    public void addParticipant(Human participant) {
        participants.add(participant);
    }
    public void makeClubActivity() {
        for (int i = 0; i < participants.size(); i++) {
            Human participant = participants.get(i);
            System.out.println(participant.getHumanData().name() + " делает активность клуба " + this.getName());
        }
    }

}
