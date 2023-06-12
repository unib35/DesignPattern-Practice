package command_pattern.multiple_remote_controller.concretecommand;

import command_pattern.multiple_remote_controller.command.Command;
import command_pattern.multiple_remote_controller.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void excute(){
        ceilingFan.off();
    }

    public void undo(){
        ceilingFan.on();
    }
}
