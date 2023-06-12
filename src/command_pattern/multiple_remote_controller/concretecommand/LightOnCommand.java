package command_pattern.multiple_remote_controller.concretecommand;

import command_pattern.multiple_remote_controller.command.Command;
import command_pattern.multiple_remote_controller.receiver.Light;

public class LightOnCommand implements Command {
    public Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void excute(){
        light.on();
    }

    public void undo(){
        light.off();
    }



}
