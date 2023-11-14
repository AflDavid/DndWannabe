package org.example;
import java.util.ArrayList;
import java.util.List;

class CharacterFactory {
    public static Character createCharacter(CharacterType type, int x, int y, int width, int length) {
        CharacterBuilder builder;

        switch (type) {
            case HUMAN:
                builder = new ConcreteCharacterBuilder("Human");
                break;
            case ELF:
                builder = new ConcreteCharacterBuilder("Elf");
                break;
            case DRAGON:
                builder = new ConcreteCharacterBuilder("Dragon");
                break;
            case SKELETON:
                builder = new ConcreteCharacterBuilder("Skeleton");
                break;
            default:
                throw new IllegalArgumentException("Invalid character type");
        }

        return builder.setPosition(x, y).setSize(width, length).build();
    }
}
