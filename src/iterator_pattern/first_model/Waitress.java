package iterator_pattern.first_model;

import java.util.List;

public class Waitress {

    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        System.out.println("아침 메뉴");
        for(int i = 0; i < breakfastItems.size(); i++){
            MenuItem menuItem = breakfastItems.get(i);
            printMenuItem(menuItem);
        }

        System.out.println("\n점심 메뉴");
        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        for(int i = 0; i < lunchItems.length; i++){
            MenuItem menuItem = lunchItems[i];
            printMenuItem(menuItem);
        }
    }

    public void printMenuItem(MenuItem menuItem){
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }


}
