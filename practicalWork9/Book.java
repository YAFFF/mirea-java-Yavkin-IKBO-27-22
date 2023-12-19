package practicalWork9;

public class Book implements Nameable, Priceable{
    private String name;
    private int price;

    public Book(String name, int price){
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
