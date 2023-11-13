package org.example;
import java.util.ArrayList;
import java.util.List;

class MoveCharacterCommand implements MoveCommand {
    private Character character;

    public MoveCharacterCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute(int newX, int newY) {
        character.moveTo(newX, newY);
    }
}

