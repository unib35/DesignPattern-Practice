package command_pattern.multiple_remote_controller.concretecommand;

import command_pattern.multiple_remote_controller.command.Command;

public class MacroCommand implements Command {
    public Command[] commands;

    public MacroCommand(Command[] commands){
            this.commands = commands;
        }

        public void excute(){
        for(int i=0;i<commands.length;i++){
            commands[i].excute();
        }
    }

    public void undo(){
        for(int i=0;i<commands.length;i++){
            commands[i].undo();
        }
    }
}
