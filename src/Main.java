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
        boolean hurt = true;
        while (true) {
            Scanner scan = new Scanner(System.in);
            String stringNames = names.toString().substring(1,names.toString().length()-1);
            System.out.println(stringNames + " are still alive");
            if (hurt){
                System.out.print("Hurt: ");
            } else {
                System.out.print("Heal: ");
            }
            String scanName = scan.nextLine();
            Item item = itemList.get(scanName);
            if (hurt){
                item.hurt();
                if (!item.aliveCheck()){
                    itemList.remove(item);
                    names.remove(scanName);
                    finalNames.add(0, scanName);
                    int size = names.size()+1;
                    System.out.println("Their placement was " + size + ".");
                    if (names.size() == 1){
                        finalNames.add(0, names.get(0));
                        break;
                    }
            } else {
                item.heal();
                }
            }
        }
        int count = 1;
        System.out.println("\nFinal placements:");
        for (String finalName : finalNames){
            System.out.println(count + ". " + finalName);
            count++;
        }
    }
}