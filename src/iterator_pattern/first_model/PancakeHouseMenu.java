package iterator_pattern.first_model;

import java.util.ArrayList;

public class PancakeHouseMenu {
    private final ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();

        addItem("K&B 팬케이크 세트", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
        addItem ("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 곁들여진 팬케이크", false, 2.99);
        addItem ("블루베리 팬케이크", "신선한 블루베리와 시럽으로 만든 팬케이크", true, 3.49);
        addItem ("와플", "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플", true, 3.59);

    }

    public final void addItem(String name, String description, boolean vegetarian, double price){
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public final ArrayList<MenuItem> getMenuItems(){
        return new ArrayList<>(menuItems);
        //new 로 하여 리턴해주는 이유는 menuItems를 직접 리턴하면 menuItems의 내용이 바뀌어버릴 수 있기 때문이다.
    }
}
