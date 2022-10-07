public class Order {
    // id = Bestellnummer
    // product -> aus der Product Klasse (Product.id & Product.name)

    // bestelle shampoo und Bodylotion
    // orderID = 12345 -> (1, Shampoo)
    //
    String orderId;
    Product product;
//      aus der Liste productList = products;

    public Order(String orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    public String toString() {
        return "Product{" +
                "orderID=" + orderId +
                ", dasProdukt mit Artikelnummer='" + product + '\'' +
                '}';
    }
}
