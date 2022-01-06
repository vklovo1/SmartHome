package ba.unsa.etf.icr.util;

public class TwoStateAppliance extends Appliance{
    private boolean state;

    public TwoStateAppliance(String name, String id, boolean state) {
        super(name, id);
        this.state = state;
    }

    public void toggleState() {
        this.state = !this.state;
    }

    public void turnOff() {
        this.state = false;
    }

    public void turnOn() {
        this.state = true;
    }
}
