package week07.day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    ToDoList toDoList = new ToDoList();
    private Path path = Paths.get("src/test/resources/todos.txt");

    @Test
    void testReadFile(){
        toDoList.createToDoListFormFile(path);
        List<String> names = Arrays.asList("cooking");
        List<String> names2 = Arrays.asList("dentist","cleaning","sweaping");

        assertEquals(4,toDoList.getToDoList().size());
        assertEquals("2022-09-07",toDoList.getToDoList().get(2).getDate().toString());
        assertEquals(names,toDoList.getToDoList().get(1).getToDoName());
        assertEquals(names2,toDoList.getToDoList().get(2).getToDoName());
    }

    @Test
    void testReadFileException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> toDoList.createToDoListFormFile(Paths.get("src/test/resources/todos....txt")));
        assertEquals("Can not red file.", exception.getMessage());
    }
}