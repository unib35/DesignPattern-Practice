package command_pattern.multiple_remote_controller.concretecommand;

import command_pattern.multiple_remote_controller.command.Command;
import command_pattern.multiple_remote_controller.receiver.Light;

public class LightOffCommand implements Command {
    public Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void excute(){
        light.off();
    }

    public void undo(){
        light.on();
    }
}
