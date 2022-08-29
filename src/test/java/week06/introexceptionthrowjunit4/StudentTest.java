package week06.introexceptionthrowjunit4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

     Student student = new Student();



    @Test
    public void testAddNote(){
        student.addNote(5);
        assertEquals(5,student.getNotes().get(0));
    }


    @Test
    public void addNoteException(){
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    () -> student.addNote(0));
            assertEquals("A jegy 1 és 5 között lehet.", exception.getMessage());


    } @Test
    public void addNoteException1(){
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    () -> student.addNote(6));
            assertEquals("A jegy 1 és 5 között lehet.", exception.getMessage());
    }

    @Test
    public void addNoteException2(){
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    () -> student.addNote(-3));
            assertEquals("A jegy 1 és 5 között lehet.", exception.getMessage());
    }

}
