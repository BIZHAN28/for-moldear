package Club;

import Humans.Human;

public interface Clubbable {
    Club createClub(String name);
    void joinClub(Human human, Club club);
}
