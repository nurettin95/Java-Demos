public class Product {  //Ürün sınıfı

    public Product(int id, String name, String description, double price, int stockAmount, String color){
        this.id = id;
        this.color = color;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public Product(){

    }

    //Aşağıdaki değiken tanımlamalarına attribute || field deniliyor.
    private int id;
    private String name;
    private String description; //ürünün açıklaması
    private double price; //ürünün fiyatı
    private int stockAmount; //ürünün stok adeti
    private String color;
    private String code;

    //getter
    public int getId(){
        return id;
    }

    //setter
    public void setId(int id){
        this.id = id; //bu clastaki id (productın id'si) = int id
        //_id = id;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    }

}
