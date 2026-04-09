package singletonpattern;

import java.util.Stack;

public class Undo {

    // The single shared instance
    private static Undo instance;
    private Stack<String> history;


    // Private — prevents new Undo() from outside
    private Undo() {
        history = new Stack<>();
    }

    // Only way to access the instance
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        history.push(command);
    }

    public String undoCommand() {
        return history.pop();
    }

    public void showHistory() {
        System.out.println(history);
    }

    public String getHistory() {
        return history.toString();
    }
    public void clearHistory() {
        history.clear();
    }
}
