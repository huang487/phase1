import java.util.ArrayList;

public class Manager extends Person {
    private int managerId;

    public Manager (int managerId){
        this.managerId = managerId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public boolean readRequest(){
        //check request.txt
        return true;
    }

    public void checkInventory(ArrayList<Ingredient> inventory) {
        for (Ingredient i: inventory){
            System.out.println(i.getName() + ": " + Integer.toString(i.getQuantity()));
        }
    }

    public void sendEmail(Ingredient in){
        in.setQuantity(in.getQuantity() + 20);//new
    }

    public void sendEmail(Ingredient in, int amount){
        in.setQuantity(in.getQuantity() + amount);//new
    }
}
