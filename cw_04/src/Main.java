import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(Multiplier.multiply(2,3));
        System.out.println(Multiplier.multiply(6,9));
        System.out.println(Multiplier.multiply(3,5,8,1));
        System.out.println(Multiplier.multiply(1.743,0.764372));

        System.out.println(Adder.add(8,4));

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("123.45"));
        numbers.add(new BigDecimal("67.89"));
        numbers.add(new BigDecimal("3.33333"));

        System.out.println(Adder.add(numbers));

        Furniture furn = new Furniture("Lamp",50);
        System.out.println(furn.getPrice());
        System.out.println(furn.getPricePlusVat());

        Furniture iture = new Furniture("Chair",100);

        List<Furniture> furnitures = new ArrayList<>();
        furnitures.add(furn);
        furnitures.add(iture);


        Room livingroom= new Room(31.5,furnitures);
        System.out.println(livingroom.getPriceIncludingVat());
        Room bedroom = new Room(15.2,furnitures);

        List<Room> rooms = new ArrayList<>();
        rooms.add(livingroom);
        rooms.add(bedroom);

        House house = new House();
        house.addRoom(livingroom);

        System.out.println(house.getRoomCount(house));

        house.addRooms(rooms);

        System.out.println(house.getRoomCount(house));

    }
}
