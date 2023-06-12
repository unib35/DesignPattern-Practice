package command_pattern.simple_remote_controller.receiver;

public class Light {
    public Light(){

    }

    public void on(){
        System.out.println("불이 켜졌습니다.");
    }

    public void off(){
        System.out.println("불이 꺼졌습니다.");
    }
}
