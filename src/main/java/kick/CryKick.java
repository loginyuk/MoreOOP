package kick;

import lotr.Character;

public class CryKick implements KickStrategy{
    public void kick(Character whoKick, Character opponent) {
        whoKick.setHp(0);
        System.out.println("😭😭😭");
    }
}
