package command_pattern.multiple_remote_controller.concretecommand;

import command_pattern.multiple_remote_controller.command.Command;
import command_pattern.multiple_remote_controller.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void excute(){
        ceilingFan.on();
    }

    public void undo(){
        ceilingFan.off();
    }
}
