import java.util.HashMap;

public class Ship extends Transport{
    private HashMap<String, Room> rooms = new HashMap<>();

    public Ship(String title) {
        super(title);
    }

    public void addRoom(Room ... room){
        for (Room r : room){
            rooms.put(r.getName(), r);
        }
    }
    public Room enterRoom(String roomName){
        return rooms.get(roomName);
    }

    @Override
    public void sail() {
        System.out.println("На корабле плывут: ");
        for (Entity entity: this.entities){
            System.out.println("\t* "+entity.stats.getName());
        }
    }
}
