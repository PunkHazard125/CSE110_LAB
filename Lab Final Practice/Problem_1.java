import java.util.ArrayList;
import java.util.Random;

public class Problem_1 {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Thread[] users = new Thread[5];

        for (int i = 0; i < users.length; i++) 
        {
            users[i] = new UserThread(cart, "User-" + (i + 1));
            users[i].start();
        }

        for (Thread user : users) 
        {
            try 
            {
                user.join();
            } 
            catch (InterruptedException ex) 
            {
                ex.printStackTrace();
            }
        }

        System.out.println("\nFinal Cart Summary:");
        System.out.println("Total Items in Cart: " + cart.getItemCount());
        System.out.println("Total Price of Cart: $" + cart.getTotalPrice());

    }
    
}

class ShoppingCart {
    
    private final ArrayList<Item> cart;

    public ShoppingCart() {

        this.cart = new ArrayList<>();

    }

    public synchronized void addItem(String itemName, double price, int quantity) {

        for (Item item : cart) 
        {
            if (item.getName().equals(itemName)) 
            {
                item.increaseQuantity(quantity);
                System.out.println(Thread.currentThread().getName() + " added " + quantity + " " + itemName + "(s).");
                return;
            }
        }

        cart.add(new Item(itemName, price, quantity));
        System.out.println(Thread.currentThread().getName() + " added " + quantity + " " + itemName + "(s).");

    }

    public synchronized void removeItem(String itemName) {

        for (Item item : cart) 
        {
            if (item.getName().equals(itemName)) 
            {
                if (item.getQuantity() > 1) 
                {
                    item.decreaseQuantity(1);
                    System.out.println(Thread.currentThread().getName() + " removed 1 " + itemName + ".");
                }
                else 
                {
                    cart.remove(item);
                    System.out.println(Thread.currentThread().getName() + " removed the last " + itemName + ".");
                }

                return;
            }
        }

        System.out.println(Thread.currentThread().getName() + " tried to remove " + itemName + " but it is not in the cart.");

    }

    public synchronized double getTotalPrice() {

        double total = 0.0;

        for (Item item : cart) 
        {
            total += item.getTotalPrice();
        }

        return total;

    }

    public synchronized int getItemCount() {

        int count = 0;

        for (Item item : cart)
         {
            count += item.getQuantity();
        }

        return count;

    }
}

class Item {

    private final String name;
    private final double price;
    private int quantity;

    public Item(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public synchronized void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public synchronized void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}

class UserThread extends Thread {

    private final ShoppingCart cart;
    private final Random random = new Random();
    private final String[] items = {"Laptop", "Phone", "Mouse", "Keyboard", "Monitor"};

    public UserThread(ShoppingCart cart, String name) {

        super(name);
        this.cart = cart;

    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) 
        {
            int action = random.nextInt(2);
            String item = items[random.nextInt(items.length)];

            if (action == 0) 
            {
                cart.addItem(item, random.nextInt(900) + 100, random.nextInt(3) + 1);
            } 
            else
            {
                cart.removeItem(item);
            }

            try 
            {
                Thread.sleep(random.nextInt(500));
            } 
            catch (InterruptedException ex) 
            {
                ex.printStackTrace();
            }
        }
    }
}
