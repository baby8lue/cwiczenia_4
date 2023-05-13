import java.util.ArrayList;
import java.util.List;

public class House {
    private static int roomCount=0;
    private List<Room> roomList;

    public House(List<Room> roomList) {
        this.roomList = roomList;
    }

    public House() {
        roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
        roomCount++;
    }

    public void addRooms(List<Room> rooms) {
        roomList.addAll(rooms);
        roomCount += rooms.size();
    }

    public int getRoomCount( House house) {
        return house.roomCount;
    }


}