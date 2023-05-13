import java.util.List;

public class Room {
    private double area;
    private List<Furniture> furnitureList;

    public Room(double area, List<Furniture> furnitureList) {
        this.area = area;
        this.furnitureList = furnitureList;
    }

    public double getPriceIncludingVat() {
        double sum = 0;
        for (Furniture furniture : furnitureList) {
            sum = sum + furniture.getPricePlusVat();
        }
        return sum;
    }
}
