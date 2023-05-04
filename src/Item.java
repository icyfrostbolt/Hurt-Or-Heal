public class Item {
    private String name;
    private int health = 20;

    public Item(String itemName){
        this.name = itemName;
    }
    public void hurt(){
        health -= 2;
    }

    public void heal(){
        health += 1;
        aliveCheck();
    }

    public boolean aliveCheck(){
        if (health <= 0) {
            System.out.println(name + " is now at " + health + " health. " + name + " has been eliminated.");
            return false;
        }
        System.out.println(name + " is now at " + health + " health.");
        return true;
    }

}
