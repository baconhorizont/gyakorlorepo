package week03.composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {

RealEstate house = new RealEstate("first house",1313123.12312,
        new Details("nagyon jó",
                new Address("Pécs","123","Petfői Sándor utca",12),
                80,900));

        System.out.println(house.toString());

        Address houseTwoAddress = new Address("Paks","7030","Fő út",32);
        Details houseTwoDetails = new Details("nem dohányzó",houseTwoAddress,120,880);

        RealEstate houseTwo = new RealEstate("houseTwo",234234.23423,houseTwoDetails);

        System.out.println(houseTwo.toString());


    }
}
