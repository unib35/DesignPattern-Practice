package command_pattern.multiple_remote_controller;

import command_pattern.multiple_remote_controller.command.Command;
import command_pattern.multiple_remote_controller.concretecommand.*;
import command_pattern.multiple_remote_controller.invoker.RemoteControl;
import command_pattern.multiple_remote_controller.receiver.CeilingFan;
import command_pattern.multiple_remote_controller.receiver.Light;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        //거실 전등 설정 : 슬롯 0번
        Light livingRoomLight = new Light("거실");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        //부엌 전등 설정 : 슬롯 1번
        Light kitchenLight = new Light("부엌");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        //거실 선풍기 설정 : 슬롯 2번
        CeilingFan fan = new CeilingFan("거실");
        CeilingFanOnCommand fanOn = new CeilingFanOnCommand(fan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
        remoteControl.setCommand(2, fanOn, fanOff);

        //전체 전등 설정 : 슬롯 5번
        Command[] allOn = {livingRoomLightOn, kitchenLightOn, fanOn};
        Command[] allOff = {livingRoomLightOff, kitchenLightOff, fanOff};
        MacroCommand allLightsOn = new MacroCommand(allOn);
        MacroCommand allLightsOff = new MacroCommand(allOff);
        remoteControl.setCommand(5, allLightsOn, allLightsOff);


        System.out.println(remoteControl);



        for(int i=0;i<RemoteControl.MAX_COMMANDS;i++){
            System.out.println("[슬롯" + i + "]");
            remoteControl.onButtonWasPressed(i);
            remoteControl.offButtonWasPressed(i);
            remoteControl.undoButtonWasPressed();
        }

    }
}
