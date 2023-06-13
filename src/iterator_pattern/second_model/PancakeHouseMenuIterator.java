package iterator_pattern.second_model;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator<MenuItem>{

    private final ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
        this.items = menuItems;
    }
    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
    @Override
    public boolean hasNext() {
        return position < items.size();
    }


}
