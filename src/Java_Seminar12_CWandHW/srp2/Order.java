package Java_Seminar12_CWandHW.srp2;

public class Order {

    public static int counter = 0;
    private final int id;
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order() {  // Добавлен конструктор по умолчанию.
        this("", "", 0, 0);
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.id = ++counter;
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}