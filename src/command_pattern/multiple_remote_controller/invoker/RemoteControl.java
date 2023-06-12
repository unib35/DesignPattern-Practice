package command_pattern.multiple_remote_controller.invoker;

import command_pattern.multiple_remote_controller.command.Command;
import command_pattern.multiple_remote_controller.concretecommand.NoCommand;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    public static int MAX_COMMANDS = 7;
    private List<Command> onCommands = new ArrayList<>();
    private List<Command> offCommands = new ArrayList<>();
    private Command undoCommand;

    public RemoteControl(){
        Command noCommand = new NoCommand();
        //nocommand로 초기화
        for(int i = 0; i < MAX_COMMANDS; i++){
            onCommands.add(i, noCommand);
            offCommands.add(i, noCommand);
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void onButtonWasPressed(int slot){
        onCommands.get(slot).excute();
        undoCommand = onCommands.get(slot);
    }

    public void offButtonWasPressed(int slot){
        offCommands.get(slot).excute();
        undoCommand = offCommands.get(slot);
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control ------\n");
        for(int i = 0; i < MAX_COMMANDS; i++){
            sb.append("[slot " + i + "] " + onCommands.get(i).getClass().getName() + "    " + offCommands.get(i).getClass().getName() + "\n");
        }
        return sb.toString();
    }



}
