package factory.factory_method_pattern2.concrete;

import factory.factory_method_pattern2.framwork.Item;

public class MpPotion implements Item {
    public void use() {
        System.out.println("마력 회복");
    }

}
