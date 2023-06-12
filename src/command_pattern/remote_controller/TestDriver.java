package command_pattern.remote_controller;

import command_pattern.remote_controller.Invoker.SimpleRemoteControl;
import command_pattern.remote_controller.concretecommand.GarageDoorOpenCommand;
import command_pattern.remote_controller.concretecommand.LightOnCommand;
import command_pattern.remote_controller.receiver.GarageDoor;
import command_pattern.remote_controller.receiver.Light;

public class TestDriver {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.buttonWasPressed();
        remote.buttonWasPressed();

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
        remote.buttonWasPressed();
        remote.buttonWasPressed();
        remote.buttonWasPressed();

    }
}
