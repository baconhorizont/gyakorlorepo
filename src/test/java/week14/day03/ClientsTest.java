package week14.day03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientsTest {

    Clients clients = new Clients();

    @Test
    void testClientsFindById(){
        clients.addClient(new Client("Ágoston","1111"));
        clients.addClient(new Client("Béla","4444"));
        clients.addClient(new Client("Kata","2222"));
        clients.addClient(new Client("Vanda","5555"));
        clients.addClient(new Client("Zorka","8888"));

        Client result = clients.findByRegNumber("2222");
        assertEquals("2222",result.getRegNumber());

        Client result2 = clients.findByRegNumber("5555");
        assertEquals("Vanda",result2.getName());

    }

    @Test
    void testClientNotFound(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> clients.findByRegNumber("1234"));
        assertEquals("Client not found.", exception.getMessage());
    }

}