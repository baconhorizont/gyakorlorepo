package week14.day03;

import java.util.Comparator;

public class ClientCompareById implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return o1.getRegNumber().compareTo(o2.getRegNumber());
    }
}
