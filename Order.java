import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;
    private Table table;
    private boolean Confirmed = false;
    private boolean Filled = false;
    private boolean Delivered = false;

    public Order(ArrayList<MenuItem> food, Table table) {
        this.items = food;
        this.table = table;
    }

    public void addItem(MenuItem food){
        items.add(food);
    }

    public void Confirm(){
        Confirmed = true;
    }

    public void Fill(){
        Filled = true;
    }

    public void Deliver(){
        Delivered = true;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public boolean isFilled() {
        return Filled;
    }

}
