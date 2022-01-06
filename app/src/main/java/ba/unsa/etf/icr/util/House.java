package ba.unsa.etf.icr.util;

import java.util.List;

public class House {
    private String name;
    private List<Room> rooms;
    private String jsonPath;
    private List<User> users;
    private static House instance = null;

    private House() {
        this.name = "My House";
        Room room = new Room("kitchen");
        Appliance appliance = new TwoStateAppliance("fridge", "1", false);
        room.addAppliance(appliance);
        this.addRoom(room);
    }

    public static House getInstance() {
        if(instance == null) {
            instance = new House();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addRoom(Room r) {
        rooms.add(r);
    }

    public void removeRoom(Room r) {
        rooms.remove(r);
    }

    public void removeRoom(String roomId) {
        for(Room r : rooms) {
            if(r.getId().equals(roomId)) {
                rooms.remove(r);
                break;
            }
        }
    }
}
