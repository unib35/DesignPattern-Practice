package factory.factory_method_pattern2.concrete;

import factory.factory_method_pattern2.framwork.Item;
import factory.factory_method_pattern2.framwork.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpPotionCreator();
        item = creator.create();
        item.use();

        creator = new MpPotionCreator();
        item = creator.create();
        item.use();
    }
}
