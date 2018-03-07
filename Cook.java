public class Cook extends Person {
    private int cookId;


    public Cook(int cookId) {
        this.cookId = cookId;
    }

    public int getCookId() {
        return cookId;
    }

    public void setCookId(int cookId) {
        this.cookId = cookId;
    }


    public void confirmOrder(Order order){
        order.Confirm();
    }

    public void cookFood(Order order){
        for(MenuItem i : order.getItems()) {
            for (Ingredient j: i.getIngredients()) {
                j.useIngredient(1);
            }
        }
        order.Fill();
    }

}
