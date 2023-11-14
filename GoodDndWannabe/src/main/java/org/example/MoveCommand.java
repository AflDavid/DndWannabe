package org.example;
import java.util.ArrayList;
import java.util.List;

interface MoveCommand {
    void execute(int newX, int newY);
}