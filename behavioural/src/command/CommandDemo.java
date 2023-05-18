package command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);
        lightSwitch.storeAndExecute(onCommand);

        System.out.println("Toggling now....");

        Command toggleCommand = new ToggleCommand(light);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        System.out.println("Switching all lights off now....");

        List<Light> lights = new ArrayList<>();
        Light bedroomLight = new Light();
        lights.add(bedroomLight);
        lights.add(light);

        Command allLightsOffCommand = new AllLightsOffCommand(lights);
        lightSwitch.storeAndExecute(allLightsOffCommand);
        
    }
}
