package org.example;
import java.util.ArrayList;
import java.util.List;

class GameRenderer {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void render() {
        for (Character character : characters) {
            System.out.println(character.render());
        }
    }
}
