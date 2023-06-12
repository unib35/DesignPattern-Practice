package factory_pattern.factory_method_pattern2.concrete;

import factory_pattern.factory_method_pattern2.framwork.Item;

public class HpPotion implements Item {
    public void use() {
        System.out.println("체력 회복");
    }
}
