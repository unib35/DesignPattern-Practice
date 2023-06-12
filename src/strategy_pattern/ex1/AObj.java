package strategy_pattern.ex1;

public class AObj {
    Ainterface ainterface;
    AObj() {
        ainterface = new AinterfaceImpl();
    }
    public void funcAA() {
        //위임. 다른객체에 위임
        ainterface.funcA();
        //System.out.println("AAA");
    }
}
