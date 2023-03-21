import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<Item>();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name of next participant: ");
            String name = input.nextLine();
            Item itemToBeAdded = new Item(name);
            itemList.add(itemToBeAdded);
        }
    }
}