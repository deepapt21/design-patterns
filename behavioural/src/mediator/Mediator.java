package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private final List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        this.lights.add(light);
    }

    public void turnOffAllLights() {
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
