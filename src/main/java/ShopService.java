import Product.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShopService {
    public static void main(String[] args) {
        System.out.println("Willkommen im unserem Shopservice");
        Product newProduct1 = new Product(1, "Shampoo");
        Product newProduct2 = new Product(2, "Bodylotion");

        List<Product> productList = new ArrayList<>();
        productList.add(newProduct1);
        productList.add(newProduct2);

        for (int i = 0; i<= 1; i++){
            System.out.println("Produkt "+ i + ": " + productList.get(i));
        }

    }
}
