import java.util.ArrayList;
import java.util.List;

public class ProductRepo{
    // ProduktListe initialisiert
    private List<Product> productList;

    public ProductRepo(){
        this.productList = new ArrayList<>();
    }

    public void addToList(Product newProduct) {
        productList.add(newProduct);
        System.out.println("Produkt der Liste hinzugefügt: " + newProduct);
    }

//    public int getProductList() {

//        for (int i = 0; i<= 0; i++){
//            System.out.println("Produkt "+ i + ": " + productList.get(i));
//        }
//        return 1;
//    }

    public List<Product> getList(){
        //System.out.println(productList);
        return productList;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productList +
                '}';
    }
}
