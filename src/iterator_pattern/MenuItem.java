package iterator_pattern;

public class MenuItem {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name, String description, String vegetarian, String price){
        this.name = name;
        this.description = description;
        this.vegetarian = Boolean.parseBoolean(vegetarian);
        this.price = Double.parseDouble(price);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return name + ", $" + price + "\n   " + description;
    }
}
