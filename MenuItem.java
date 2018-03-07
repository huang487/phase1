//import java.lang.reflect.Array;
import java.util.ArrayList;

public class MenuItem {
    private String name;
    private ArrayList<Ingredient> ingredients;
    private int price;

    public MenuItem(String name, int price){
        this.name = name;
        this.ingredients = new ArrayList<Ingredient>();
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    public void extraIngredient(Ingredient ingredient, int amount){
        ingredient.useIngredient(amount);
    }

    public String getName() {
        return name;
    }
}

