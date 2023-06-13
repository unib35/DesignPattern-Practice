package adapter_pattern.DuckAndTurkey;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallardeDuck duck = new MallardeDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for(int i = 0; i < 5; i++){
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
