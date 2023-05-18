package mediator;

// receiver - maintained state
public class Light {

    private boolean isOn = true;

    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
    }

    public void on() {
        System.out.println(this.name + " Light switched on.");
        isOn = true;
    }

    public void off() {
        System.out.println(this.name + " Light switched off.");
        isOn = false;
    }
}
