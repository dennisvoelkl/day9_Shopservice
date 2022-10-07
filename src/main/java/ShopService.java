import java.util.ArrayList;

public class ShopService{

    ProductRepo productRepo;
    OrderRepo orderRepo;

    // PRODUKT
    public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void addProduct(Product newProduct){
        productRepo.addToList(newProduct);

    }

    // ORDER
    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void addOrder(Order newOrder){
        orderRepo.addToList(newOrder);

    }


}
