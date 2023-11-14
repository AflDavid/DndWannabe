package org.example;
import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        int boardWidth = 30;
        int boardLength = 30;
        SceneType sceneType = SceneType.EUROPEAN;
        int numberOfHouses = 3;

        // Create characters and board
        Character human = CharacterFactory.createCharacter(CharacterType.HUMAN, 0, 0, 2, 2);
        Character elf = CharacterFactory.createCharacter(CharacterType.ELF, 1, 1, 2, 2);
        Character dragon = CharacterFactory.createCharacter(CharacterType.DRAGON, 2, 2, 3, 3);
        Board gameBoard = new Board(boardWidth, boardLength);

        // Place characters on the board
        gameBoard.placeCharacter(human);
        gameBoard.placeCharacter(elf);
        gameBoard.placeCharacter(dragon);

        // Place houses on the board
        for (int i = 0; i < numberOfHouses; i++) {
            int houseX = (int) (Math.random() * (boardWidth - 4 + 1));
            int houseY = (int) (Math.random() * (boardLength - 4 + 1));
            HouseMaterial houseMaterial = getRandomHouseMaterial();
            gameBoard.placeHouse(houseX, houseY, houseMaterial);
        }

        // Render the board
        gameBoard.render();
    }

    private static HouseMaterial getRandomHouseMaterial() {
        // Function to get a random house material
        HouseMaterial[] materials = HouseMaterial.values();
        return materials[(int) (Math.random() * materials.length)];
    }
}