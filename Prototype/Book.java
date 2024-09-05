package Prototype;

public class Book {

    private int b_id;
    private String name;

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getB_id() {
        return b_id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_id=" + b_id +
                ", name='" + name + '\'' +
                '}';
    }
}
