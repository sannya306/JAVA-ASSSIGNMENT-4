import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
class Inventory {
    HashMap<Integer, Integer> products = new HashMap<>();
    void addProduct(int id, int stock) {
        products.put(id, stock);
        System.out.println("Product " + id +
                           " added with stock " + stock);
    }
    void updateStock(int id, int stock) {
        products.put(id, stock);
        System.out.println("Stock updated successfully.");
    }
    void displayInventory() {
        Iterator<Map.Entry<Integer, Integer>> iterator =
                products.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();

            System.out.println("Product ID: " + entry.getKey() +
                               ", Stock: " + entry.getValue());
        }
    }
}
public class Q4_Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        System.out.println("1. Add Product");
        System.out.println("2. Update Stock");
        System.out.println("3. Display Inventory");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();
            inventory.addProduct(id, stock);
        }
    }
}
