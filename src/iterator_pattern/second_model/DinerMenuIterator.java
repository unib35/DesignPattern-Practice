package iterator_pattern.second_model;

public class DinerMenuIterator implements Iterator<MenuItem>{

    private final MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems){
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        //items[position] != null을 사용하는 이유는 배열의 크기가 4인데 실제로는 2개만 들어있을 수도 있기 때문이다.
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
