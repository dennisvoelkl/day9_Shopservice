import Product.*;
public class ShopService {
    public static void main(String[] args) {
        System.out.println("Willkommen im unserem Shopservice");
        Product newProduct = new Product();
        newProduct.setProductID(1);
        newProduct.setProductName("Shampoo");
        //System.out.println(newProduct.getProductID());
        //System.out.println(newProduct.getProductName());
        System.out.println(newProduct);
    }
}
