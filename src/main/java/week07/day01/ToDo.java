package week07.day01;

import java.time.LocalDate;
import java.util.List;

public class ToDo {

    private List<String> toDoName;
    private LocalDate date;
    public ToDo(List<String> toDoName, LocalDate date) {
        this.toDoName = toDoName;
        this.date = date;
    }

    public List<String> getToDoName() {
        return toDoName;
    }

    public LocalDate getDate() {
        return date;
    }
}
