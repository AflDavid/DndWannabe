package org.example;
import java.util.ArrayList;
import java.util.List;

class Board {
    private char[][] grid;

    public Board(int width, int length) {
        grid = new char[width][length];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '.';
            }
        }
    }

    public void placeCharacter(Character character) {
        grid[character.getX()][character.getY()] = character.getDescription().charAt(0);
    }

    public void placeHouse(int x, int y, HouseMaterial material) {
        char houseSymbol;
        switch (material) {
            case STONE:
                houseSymbol = 'S';
                break;
            case BAMBOO:
                houseSymbol = 'B';
                break;
            case ADOBE:
                houseSymbol = 'A';
                break;
            default:
                throw new IllegalArgumentException("Invalid house material");
        }

        if (x >= 0 && x + 3 < grid.length && y >= 0 && y + 3 < grid[0].length) {
            for (int i = x; i < x + 4; i++) {
                for (int j = y; j < y + 4; j++) {
                    grid[i][j] = houseSymbol;
                }
            }
        } else {
            System.out.println("Cannot place house at (" + x + ", " + y + "). It goes out of bounds.");
        }
    }

    public void render() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

