import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    // ProduktListe initialisiert
    private List<Order> orderList;

    public OrderRepo(){
        this.orderList = new ArrayList<>();
    }

    public void addToList(Order newOrder) {
        orderList.add(newOrder);
        System.out.println("Produkt der Liste hinzugefügt: " + newOrder);
    }


    public List<Order> getList(){
        //System.out.println(productList);
        return orderList;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + orderList +
                '}';
    }

}
