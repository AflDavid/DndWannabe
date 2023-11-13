package org.example;
import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        int boardWidth = 10;
        int boardLength = 10;
        SceneType sceneType = SceneType.EUROPEAN; // Change scene type as needed
        int numberOfHouses = 3;

        // Determine house material based on scene type
        HouseMaterial houseMaterial;
        switch (sceneType) {
            case EUROPEAN:
                houseMaterial = HouseMaterial.STONE; // Change to STONE
                break;
            case ASIAN:
                houseMaterial = HouseMaterial.BAMBOO;
                break;
            case AFRICAN:
                houseMaterial = HouseMaterial.ADOBE;
                break;
            default:
                throw new IllegalArgumentException("Invalid scene type");
        }

        // Create characters
        Character human = CharacterFactory.createCharacter(CharacterType.HUMAN, 0, 0, 2, 2);
        Character elf = CharacterFactory.createCharacter(CharacterType.ELF, 1, 1, 2, 2);
        Character dragon = CharacterFactory.createCharacter(CharacterType.DRAGON, 2, 2, 3, 3);

        // Create commands for moving characters
        MoveCommand moveHumanCommand = new MoveCharacterCommand(human);
        MoveCommand moveElfCommand = new MoveCharacterCommand(elf);
        MoveCommand moveDragonCommand = new MoveCharacterCommand(dragon);

        // Move characters
        moveHumanCommand.execute(3, 3);
        moveElfCommand.execute(4, 4);
        moveDragonCommand.execute(5, 5);

        // Create game renderer
        GameRenderer gameRenderer = new GameRenderer();

        // Add characters to the renderer
        gameRenderer.addCharacter(human);
        gameRenderer.addCharacter(elf);
        gameRenderer.addCharacter(dragon);

        // Render the game
        gameRenderer.render();
    }
}