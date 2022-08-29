package week06.introexceptionthrowjunit4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank = new Tank();

    @Test
    public void testAddAngle(){
        tank.modifyAngle(30);
        assertEquals(tank.getAngle(),30);
    }

    @Test
    public void testAddAngleExceptionRight(){
        tank.modifyAngle(50);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(50));
        assertEquals("nem tud ennyit jobbra forduli a tank", exception.getMessage());
    }

    @Test
    public void testAddAngleExceptionLeft(){
        tank.modifyAngle(-70);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(-15));
        assertEquals("nem tud ennyit balra forduli a tank", exception.getMessage());
    }

    @Test
    public void testAddAngleExceptionBack(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(180));
        assertEquals("nem tud hátra forduli a tank", exception.getMessage());
    }


}