package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            c2.kick(c1);
        }
        if (c1.isAlive()) {
            System.out.println("Winner is " + c1.getClass().getSimpleName());
        }
        else {
            System.out.println("Winner is " + c2.getClass().getSimpleName());
        }
    }
}
