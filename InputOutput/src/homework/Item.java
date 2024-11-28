package homework;

public class Item {
    private String name;
    private String description;
    private Double price;

    public Item() {
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

//    public Item(String name, String description, Double price) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", description='" + description + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
