import java.util.ArrayList;

public class Server extends Person {
    private int serverId;

    public Server(int serverId) {
        this.serverId = serverId;
    }

    public void checkBill(Table t) {
        System.out.println(t.getBill());
    }

    public Order createOrder(ArrayList<MenuItem> items, Table table) {
        return new Order(items, table);
    }

    public boolean checkStatus (Order order){
        return order.isFilled();
    }

    public void deliverFood(Order order){
        order.Deliver();
    }

    public void confirmItem(MenuItem i, Table table){
        int b = table.getBill();
        table.setBill(i.getPrice() + b);

    }


    public String toString(){
        return "Server" + serverId;
    }


}