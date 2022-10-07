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

    }
}
