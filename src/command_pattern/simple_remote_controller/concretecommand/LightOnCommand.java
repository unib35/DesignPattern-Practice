package command_pattern.simple_remote_controller.concretecommand;

import command_pattern.simple_remote_controller.command.Command;
import command_pattern.simple_remote_controller.receiver.Light;

public class LightOnCommand implements Command {
    private Light light;
    private boolean isOn = false;


    //어떤 전등인지 LightOnCommand의 생성자가 실행되는 시점에 결정된다.
    public LightOnCommand(Light light){
        this.light = light;
    }

    public void excute(){
        if(isOn){
            light.off();
            isOn = false;
        }
        else{
            light.on();
            isOn = true;
        }
    }

}
