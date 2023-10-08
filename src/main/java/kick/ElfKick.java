package kick;

import lotr.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character whokick, Character opponent) {
        if (opponent.getHp() > whokick.getHp()) {
            whokick.setHp(0);
        }
        else {
            whokick.setHp(1);
        }
        System.out.println("aaaaa");
    }
}
