package command_pattern.simple_remote_controller.Invoker;

import command_pattern.simple_remote_controller.command.Command;

//Concrete Command
public class SimpleRemoteControl {
    private Command command;

    public SimpleRemoteControl(){

    }
    //어떤 커맨드를 실행할것인지 결정
    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonWasPressed(){
        command.excute();
    }
}
