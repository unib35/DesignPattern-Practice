package factory_method_pattern2.framwork;

public abstract class ItemCreator {
    public Item create(){
        Item item;
        //step1
        requestItemsInfo();
        //step2
        item = createItem();
        //step3
        createItemLog();
        return item;
    }

    abstract protected void requestItemsInfo();

    abstract protected void createItemLog();
    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();


}
