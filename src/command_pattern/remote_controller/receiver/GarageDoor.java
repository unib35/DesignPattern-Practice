package command_pattern.remote_controller.receiver;

public class GarageDoor {
    public GarageDoor(){

    }

    public void up(){
        System.out.println("차고 문이 열립니다.");
    }

    public void down(){
        System.out.println("차고 문이 닫힙니다.");
    }
}
