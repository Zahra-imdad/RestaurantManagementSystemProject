
package resturantmanagement.model;

public class Item {
    private String filePath;
    private int id;
    private String name;
    private String category;
    private int price;
    private int quantity;

    public Item(int id,String name,String category, int price) {
        this.id=id;
        this.name = name;
        this.category=category;
        this.price = price;
        this.quantity = quantity;
    }
     public Item(String filePath,String id,String name,String category,int price){
        this.filePath= filePath;
        this.name=name;
        this.category=category;
        this.price=price;
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCategory() {
        return name;
    }

    public void setCategory(String name) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
