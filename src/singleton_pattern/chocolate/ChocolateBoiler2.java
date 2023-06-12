package singleton_pattern.chocolate;

public class ChocolateBoiler2 {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler2 uniqueInstance;
    //싱글톤 패턴 적용
    //생성자 private 접근지정자 선언
    private ChocolateBoiler2(){
        empty = true;
        boiled = false;
        System.out.println("초콜렛 보일러 생성자 실행");
    }
    //getInstance 메소드 구현
    //synchronized 키워드를 사용하여 쓰레드 동기화
    public static synchronized ChocolateBoiler2 getInstance(){
        if(uniqueInstance == null){
            try{
                System.out.println("1초간 지연");
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("초콜렛 보일러 인스턴스 생성");
            uniqueInstance = new ChocolateBoiler2();

        }
        System.out.println("초콜렛 보일러 인스턴스 반환");
        return uniqueInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("보일러에 우유/초콜렛을 혼합한 재료를 채웁니다.");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            System.out.println("끓인 재료를 다음 단계로 넘깁니다.");
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            System.out.println("재료를 끓입니다.");
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

}
