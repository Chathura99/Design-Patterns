package Behavioral.Command;
interface Command {
    void execute();
}

class Light {
    public void turnOn() {
        System.out.println("Light is On");
    }

    public void turnOff() {
        System.out.println("Light is Off");
    }
}

class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }
}
