package org.example;
import java.util.ArrayList;
import java.util.List;


interface CharacterBuilder {
    CharacterBuilder setPosition(int x, int y);
    CharacterBuilder setSize(int width, int length);
    Character build();
}