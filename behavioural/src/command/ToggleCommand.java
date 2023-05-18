package command;

// concrete command.
public class ToggleCommand implements Command {
    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.toggle();
    }
}
