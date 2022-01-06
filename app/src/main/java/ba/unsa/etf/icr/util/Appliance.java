package ba.unsa.etf.icr.util;

import androidx.annotation.Nullable;

public class Appliance {
    private String name;
    private String id;

    public Appliance(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Appliance)) {
            return false;
        }

        Appliance o = (Appliance) obj;

        return this.getId().equals(o.getId());
    }
}
