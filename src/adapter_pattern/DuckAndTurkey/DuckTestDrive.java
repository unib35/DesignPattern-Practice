package adapter_pattern.DuckAndTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardeDuck duck = new MallardeDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe turkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
