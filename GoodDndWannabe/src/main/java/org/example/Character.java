package org.example;
import java.util.ArrayList;
import java.util.List;


class Character {
    private int x, y, width, length;
    private String description;

    public Character(int x, int y, int width, int length, String description) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        this.description = description;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDescription() {
        return description;
    }

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public String render() {
        return String.format("%s at (%d, %d) - Size: (%d, %d)", description, x, y, width, length);
    }
}