package week03.consultations.d03;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String name;
    private List<LocalDateTime> playAgenda = new ArrayList<>();

    public Movie(String name, List<LocalDateTime> playAgenda) {
        this.name = name;
        this.playAgenda = playAgenda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LocalDateTime> getPlayAgenda() {
        return playAgenda;
    }

    public void setPlayAgenda(List<LocalDateTime> playAgenda) {
        this.playAgenda = playAgenda;
    }
}
