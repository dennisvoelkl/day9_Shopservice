import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen im unserem Shopservice Marc");
        // Erste Aufgabe aus Main ein Produkt erstellen
        Product newProduct1 = new Product(1, "Shampoo");
        Product newProduct2 = new Product(2, "Bodylotion");
        Product newProduct3 = new Product(3, "Aftershave");
//        System.out.println("Produkt: "+ newProduct1);
        // Liste der Produkte an Shop Service übergeben
        // newProduct1 -> ShopService
        ProductRepo productRepo = new ProductRepo();
        ShopService shopService = new ShopService(productRepo);
        shopService.addProduct(newProduct1);
        shopService.addProduct(newProduct2);
        shopService.addProduct(newProduct3);


        System.out.println(productRepo.getList());

        Order newOrder = new Order("34567", newProduct1);
        Order newOrder2 = new Order("111", newProduct3);
        Order newOrder3 = new Order("88765", newProduct2);


        OrderRepo orderRepo = new OrderRepo();
        ShopService shopService1 = new ShopService(orderRepo);
        shopService1.addOrder(newOrder);
        shopService1.addOrder(newOrder2);
        shopService1.addOrder(newOrder3);

        System.out.println(orderRepo.getList());




    }
}
