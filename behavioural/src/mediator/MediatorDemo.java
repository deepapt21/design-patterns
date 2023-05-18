package mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator med = new Mediator();

        med.registerLight(new Light("Bedroom"));
        med.registerLight(new Light("Kitchen"));

        Command turnOffAllLights = new AllLightsOffCommand(med);
        turnOffAllLights.execute();
    }
}
