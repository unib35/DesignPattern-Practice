package factory.factory_method_pattern2.concrete;

import factory.factory_method_pattern2.framwork.Item;
import factory.factory_method_pattern2.framwork.ItemCreator;

public class MpPotionCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 회복 물약을 새로 생성했습니다." + new java.util.Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
