package week07.day01;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private List<ToDo> toDoList = new ArrayList<>();
    void createToDoListFormFile(Path path){
            readFile(path);
    }
    private void readFile(Path path){
        try {
            Scanner scanner = new Scanner(path);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] temp = line.split(";");
                addToDo(temp);
            }
        }catch (IOException ioe){
            throw new IllegalArgumentException("Can not red file.",ioe);
        }
    }
    private void addToDo(String[] todo){
        List<String> temp = new ArrayList<>();
        if(todo[1].contains(",")){
                String[] dailyTodos = todo[1].split(",");
            temp.addAll(Arrays.asList(dailyTodos));
            } else {
            temp.add(todo[1]);
        }
    toDoList.add(new ToDo(temp,LocalDate.parse(todo[0])));
    }
    public List<ToDo> getToDoList() {
        return toDoList;
    }
}
