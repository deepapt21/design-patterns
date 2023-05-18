package mediator;

public class AllLightsOffCommand implements Command {

    private final Mediator med;

    public AllLightsOffCommand(Mediator med) {
        this.med = med;
    }

    public void execute() {
        med.turnOffAllLights();
    }
}
