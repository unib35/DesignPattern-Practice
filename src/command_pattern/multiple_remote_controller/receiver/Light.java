package command_pattern.multiple_remote_controller.receiver;

public class Light {
    private String location;

    public Light(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " 불이 켜졌습니다.");
    }

    public void off(){
        System.out.println(location + " 불이 꺼졌습니다.");
    }
}
