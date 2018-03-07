import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.*;
import java.text.BreakIterator;
import java.util.*;

public class Restaurant {

//    public void checkStorage() {
//        for (Ingredient i : inventory) {
//            if (i.OutOfStorage()) {
//                //write request;
//            }
//        }
//    }

    public static void main(String[] args) throws IOException {
        /**
         * This is the menu creation/initialization
         */
        ArrayList<Ingredient> inventory = new ArrayList<Ingredient>();
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        ArrayList<Table> tables = new ArrayList<Table>();
        ArrayList<Server> servers = new ArrayList<Server>();
        ArrayList<Cook> cooks = new ArrayList<Cook>();
        ArrayList<Manager> managers = new ArrayList<Manager>();
        ArrayList<Order> orders = new ArrayList<Order>();


        Ingredient rice = new Ingredient("rice",20,10);
        inventory.add(rice);
        Ingredient seaweed = new Ingredient("seaweed",20, 10);
        inventory.add(seaweed);
        Ingredient crabMeat = new Ingredient("crabMeat",20, 10);
        inventory.add(crabMeat);
        Ingredient mayo = new Ingredient("mayo",20,10);
        inventory.add(mayo);
        Ingredient avocado = new Ingredient("avocado",20,10);
        inventory.add(avocado);
        Ingredient cucumber = new Ingredient("cucumber",20,10);
        inventory.add(cucumber);
        Ingredient tempura = new Ingredient("tempura",20,10);
        inventory.add(tempura);
        Ingredient salmon = new Ingredient("salmon",20,10);
        inventory.add(salmon);
        Ingredient wasabi = new Ingredient("wasabi",20,10);
        inventory.add(wasabi);
        Ingredient tuna = new Ingredient("tuna",20,10);
        inventory.add(tuna);
        Ingredient soySauce = new Ingredient("soySauce",20,10);
        inventory.add(soySauce);
        Ingredient sake = new Ingredient("sake",20,10);
        inventory.add(sake);


        MenuItem californiaRoll = new MenuItem("California Roll", 12);
        californiaRoll.addIngredients(rice);
        californiaRoll.addIngredients(seaweed);
        californiaRoll.addIngredients(crabMeat);
        californiaRoll.addIngredients(mayo);
        californiaRoll.addIngredients(avocado);
        californiaRoll.addIngredients(cucumber);
        menu.add(californiaRoll);

        MenuItem dynamiteRoll = new MenuItem("Dynamite Roll", 15);
        dynamiteRoll.addIngredients(rice);
        dynamiteRoll.addIngredients(seaweed);
        dynamiteRoll.addIngredients(tempura);
        dynamiteRoll.addIngredients(mayo);
        dynamiteRoll.addIngredients(cucumber);
        dynamiteRoll.addIngredients(salmon);
        menu.add(dynamiteRoll);

        MenuItem nigiri = new MenuItem("Nigiri", 10);
        nigiri.addIngredients(salmon);
        nigiri.addIngredients(wasabi);
        nigiri.addIngredients(rice);
        menu.add(nigiri);

        MenuItem sashimi = new MenuItem("Sashimi", 20);
        sashimi.addIngredients(salmon);
        sashimi.addIngredients(tuna);
        sashimi.addIngredients(wasabi);
        sashimi.addIngredients(soySauce);
        menu.add(sashimi);

        MenuItem hotSake = new MenuItem("Hot Sake", 15);
        hotSake.addIngredients(sake);
        menu.add(hotSake);

        Table table0 = new Table(0);
        tables.add(table0);
        Table table1 = new Table(1);
        tables.add(table1);
        Table table2 = new Table(2);
        tables.add(table2);
        Table table3 = new Table(3);
        tables.add(table3);
        Table table4 = new Table(4);
        tables.add(table4);
        Table table5 = new Table(5);
        tables.add(table5);
        Table table6 = new Table(6);
        tables.add(table6);
        Table table7 = new Table(7);
        tables.add(table7);
        Table table8 = new Table(8);
        tables.add(table8);
        Table table9 = new Table(9);
        tables.add(table9);


        Server server0 = new Server(0);
        servers.add(server0);
        Server server1 = new Server(1);
        servers.add(server1);
        Server server2 = new Server(2);
        servers.add(server2);

        Cook cook0 = new Cook(0);
        cooks.add(cook0);
        Cook cook1 = new Cook(1);
        cooks.add(cook1);
        Cook cook2 = new Cook(2);
        cooks.add(cook2);

        Manager manager0 = new Manager(0);
        managers.add(manager0);
        Manager manager1 = new Manager(1);
        managers.add(manager1);



//        String menuFile = "Menu.txt";
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(menuFile))) {
//            String line = fileReader.readLine();
//            while (line != "*") {
//                String[] lines = line.split(", ");
//                inventory.add(new Ingredient(lines[0], Integer.valueOf(lines[1]), Integer.valueOf(lines[2])));
//                line = fileReader.readLine();
//            }
//            line = fileReader.readLine();
//            while (line != "*") {
//                String [] lines = line.split(", ");
//                MenuItem item = new MenuItem(lines[0], Integer.valueOf(lines[1])));
//                for (int i = 2; i < lines.length; i++) {
//                    item.addIngredients(lines[i]);
//                }
//            }
//        }

        String fileName = "EventsTest.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line = fileReader.readLine();
            while (line != null) {
                String[] lines = line.split("\\|");
                if (lines[1].substring(1, 1).equals("s")) {
                    Server server = servers.get(Integer.valueOf(lines[1].substring(2, 2)));
                    if (lines[2].equals("1")) {
                        ArrayList<MenuItem> orderItems = new ArrayList<MenuItem>();
                        String[] OI = lines[4].split(",");
                        for (String item : OI) {
                            for (MenuItem menuItem : menu) {
                                if (menuItem.getName().equals(item.substring(1))) {
                                    orderItems.add(menuItem);
                                }
                            }
                        }
                        server.createOrder(orderItems, tables[Integer.valueOf(lines[3].substring(1))]);
                    }
                }

            }
        }

    }
}