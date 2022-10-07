import java.util.ArrayList;

public class ShopService{

    ProductRepo productRepo;

    public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void addProduct(Product newProduct){
        productRepo.addToList(newProduct);

    }


}
