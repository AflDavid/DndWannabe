package org.example;
import java.util.ArrayList;
import java.util.List;

class ConcreteCharacterBuilder implements CharacterBuilder {
    private int x, y, width, length;
    private String description;

    public ConcreteCharacterBuilder(String description) {
        this.description = description;
    }

    @Override
    public CharacterBuilder setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    public CharacterBuilder setSize(int width, int length) {
        this.width = width;
        this.length = length;
        return this;
    }

    @Override
    public Character build() {
        return new Character(x, y, width, length, description);
    }
}