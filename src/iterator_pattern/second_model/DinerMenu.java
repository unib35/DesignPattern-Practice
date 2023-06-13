package iterator_pattern.second_model;



public class DinerMenu {
    private static final int MAX_ITEMS = 4;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT", "통밀 위에(식물성)베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
        addItem("오늘의 스프", "감자 샐러드를 겉은 피망으로 둘러싼 오늘의 스프", false, 3.29);
        addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
    }

    public final void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.err.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        } else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public final MenuItem[] getMenuItems(){
        return menuItems.clone();
        //clone()을 사용하여 리턴해주는 이유는 menuItems를 직접 리턴하면 menuItems의 내용이 바뀌어버릴 수 있기 때문이다.
    }

    public Iterator<MenuItem> createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
