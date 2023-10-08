package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        List<Class <? extends Character>> characters = Arrays.asList(King.class, Knight.class, Hobbit.class, Elf.class);
        return characters.get(new Random().nextInt(characters.size())).getDeclaredConstructor().newInstance();
    }
}
