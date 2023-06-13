package template_method_pattern.array_sort;

public class Duck implements Comparable<Duck>{
    private String name;
    private int weight;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name + " weighs " + weight;
    }

    public int compareTo(Duck otherDuck){
        int status = -1;

        if(this.weight < otherDuck.weight){
            status = 1;
        } else if(this.weight == otherDuck.weight){
            status = 0;
        } else{
            status = -1;
        }
        return status;
    }
}
