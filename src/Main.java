import java.util.*;
public class Main {
    public static void main(String[] args) {
        Dictionary<String, Item> itemList = new Hashtable<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> finalNames = new ArrayList<>();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name of next participant: ");
            String name = input.nextLine();
            if (Objects.equals(name, "Done")) {
                break;
            } else {
                Item itemToBeAdded = new Item(name);
                names.add(name);
                itemList.put(name, itemToBeAdded);
            }
        }
        while (true) {
            for (int i = 0; i <= 2; i++){
                Scanner hurt = new Scanner(System.in);
                String hurtStringNames = names.toString().substring(1,names.toString().length()-1);
                System.out.println(hurtStringNames + " are still alive");
                System.out.print("Hurt: ");
                String hurtName = hurt.nextLine();
                Item hurt_item = itemList.get(hurtName);
                hurt_item.hurt();
                if (!hurt_item.aliveCheck()){
                    itemList.remove(hurt_item);
                    names.remove(hurtName);
                    finalNames.add(0, hurtName);
                    int size = names.size()+1;
                    System.out.println("Their placement was " + size);
                }
                Scanner heal = new Scanner(System.in);
                String healStringNames = names.toString().substring(1,names.toString().length()-1);
                System.out.println(healStringNames + " are still alive");
                System.out.print("Heal: ");
                String healName = heal.nextLine();
                Item heal_item = itemList.get(healName);
                heal_item.heal();
            }
        }
    }
}