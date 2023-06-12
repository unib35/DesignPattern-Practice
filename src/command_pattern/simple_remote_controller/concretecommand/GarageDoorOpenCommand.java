package command_pattern.simple_remote_controller.concretecommand;

import command_pattern.simple_remote_controller.command.Command;
import command_pattern.simple_remote_controller.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;
    private boolean isOpen = false;


    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void excute(){
        if(isOpen){
            garageDoor.down();
            isOpen = false;
        } else{
            garageDoor.up();
            isOpen = true;
        }
    }


}
