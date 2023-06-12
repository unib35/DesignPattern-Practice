package command_pattern.multiple_remote_controller.receiver;

public class CeilingFan {
    private String location;

    public CeilingFan(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + "의 선풍기가 켜졌습니다.");
    }

    public void off(){
        System.out.println(location + "의 선풍기가 꺼졌습니다.");
    }
}
