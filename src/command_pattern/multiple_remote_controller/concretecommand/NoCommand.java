package command_pattern.multiple_remote_controller.concretecommand;

import command_pattern.multiple_remote_controller.command.Command;

public class NoCommand implements Command {
    public void excute(){
        System.out.println("No command");
    }

    @Override
    public void undo() {
        System.out.println("No command");
    }

}
