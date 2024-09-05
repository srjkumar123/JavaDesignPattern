package Prototype;

public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName(3873873);
        bs.loadData();

        System.out.println(bs.getShopName());
        for (Book book : bs.books ){
            System.out.println(book);
        }
        System.out.println("=======================================================================");

        BookShop bs1 = bs.clone();
        bs.getBooks().remove(3);



        System.out.println(bs.getShopName());
        for (Book book : bs.books ){
            System.out.println(book);
        }

        System.out.println("=======================================================================");

        bs1.setShopName(8383);
        System.out.println(bs1.getShopName());
        for (Book book1 : bs1.books ){
            System.out.println(book1);
        }
    }
}
