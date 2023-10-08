package kick;

import java.util.Random;

import lotr.Character;

public class NobleKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character opponent) {
        if (opponent.getPower() == 0) {
            opponent.setHp(0);
            return;
        }

        opponent.setHp(opponent.getHp() - new Random().nextInt(whoKick.getPower()));
        if (opponent.getHp() < 0) {
            opponent.setHp(0);
        }
    }
}
