package singletonpattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UndoTest {

    private Undo undo;

    @BeforeEach
    void setUp() {
        undo = Undo.getInstance();
        undo.clearHistory();
    }

    @Test
    void testGetInstanceReturnsSameObject() {
        Undo instance1 = Undo.getInstance();
        Undo instance2 = Undo.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testAddCommand() {
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");
        assertEquals("[mkdir carpeta, cd carpeta]", undo.getHistory());
    }

    @Test
    void testUndoCommand() {
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");
        undo.undoCommand();
        assertEquals("[mkdir carpeta]", undo.getHistory());
    }

    @Test
    void testShowHistory() {
        undo.addCommand("mkdir carpeta");
        undo.addCommand("cd carpeta");
        assertDoesNotThrow(() -> undo.showHistory());
        assertEquals("[mkdir carpeta, cd carpeta]", undo.getHistory());
    }
}