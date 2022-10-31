package week14.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clients {

    private final List<Client> clients = new ArrayList<>();

    public void addClient(Client client){
        clients.add(client);
    }

    public Client findByRegNumber(String reNumber){
        int result = Collections.binarySearch(clients,new Client(reNumber),new ClientCompareById());
        if(result == -1){
            throw new IllegalArgumentException("Client not found.");
        }
        return clients.get(result);
    }

}
