package ba.unsa.etf.icr.util;

import androidx.annotation.Nullable;

import java.util.List;

public class Room {
    private String name;
    private List<Appliance> appliances;
    private String id;

    public Room() {
        this.name = "Room #" + appliances.size() + 1;
    }

    public Room(String name) {
        this.name = name;
    }

    public Room(String name, List<Appliance> appliances) {
        this.name = name;
        this.appliances = appliances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }

    public void setAppliances(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    public String getId() {
        return id;
    }

    public void addAppliance(Appliance a) {
        appliances.add(a);
    }

    public void removeAppliance(Appliance a) {
        appliances.remove(a);
    }

    public void removeAppliance(String appId) {
        for(Appliance a : appliances) {
            if(a.getId().equals(appId)) {
                appliances.remove(a);
                break;
            }
        }
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Room)) {
            return false;
        }

        Room o = (Room) obj;

        return this.getId().equals(o.getId());
    }
}
