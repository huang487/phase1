public class Ingredient {
    private String name;
    private int quantity;//problem area
    private int threshold;

    public Ingredient(String name, int quantity, int threshold){
        this.name = name;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    public boolean OutOfStorage(){
        return threshold >= quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void useIngredient(int amount){//new
        quantity = quantity - amount;
    }

    public String toString(){
        return name;
    }
}
