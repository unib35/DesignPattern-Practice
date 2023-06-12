package command_pattern.hamburger;

public class Waitress {
    private Command command;

    public void takeOrder(){
        System.out.printf("웨이트리스가 주문을 받음.");
        command.orderUp();
    }

    public void setCommand(Command command){
        this.command = command;
    }
}
