package week12.day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TrainerFinderTest {

    TrainerFinder trainerFinder = new TrainerFinder();
    Path path = Path.of("src/test/resources/beosztas.txt");


    @Test
    void testRead(){
        trainerFinder.readFromFile(path);
        assertEquals(329,trainerFinder.getTrainers().size());
        assertEquals("Albatrosz Aladin",trainerFinder.getTrainers().get(0).getName());
    }

    @Test
    void testGetHourByName(){
        trainerFinder.readFromFile(path);
        int result = trainerFinder.givenHoursByName("Albatrosz Aladin");
        assertEquals(24,result);
    }
    @Test
    void testGetHourByNameException(){
        TrainerNotExistException exception = assertThrows(TrainerNotExistException.class,
                () -> trainerFinder.givenHoursByName("almafa"));
        assertEquals("Trainer don't exist.", exception.getMessage());
    }
}
