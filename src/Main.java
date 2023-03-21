import java.util.*;
public class Main {
    public static void main(String[] args) {
        Dictionary<String, Item> itemList = new Hashtable<>();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name of next participant: ");
            String name = input.nextLine();
            if (Objects.equals(name, "Done")) {
                break;
            } else {
                Item itemToBeAdded = new Item(name);
                itemList.put(name, itemToBeAdded);
            }
        }
        while (true) {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i <= 2; i++){
                Scanner hurt = new Scanner(System.in);
                System.out.print("Hurt: ");
                String hurtName = hurt.nextLine();
                Item hurt_item = itemList.get(hurtName);
                hurt_item.hurt();
                if (!hurt_item.aliveCheck()){
                    itemList.remove(hurt_item);
                }
                Scanner heal = new Scanner(System.in);
                System.out.print("Heal: ");
                String healName = heal.nextLine();
                Item heal_item = itemList.get(healName);
                heal_item.heal();
            }
        }
    }
}