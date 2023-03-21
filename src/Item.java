public class Item {
    private String name;
    private int health = 20;
    private boolean alive = true;

    public Item(String itemName){
        this.name = itemName;
    }
    public void hurt(){
        health -= 2;
        alive = alive_check();
    }

    public void heal(){
        health += 1;
        alive = alive_check();
    }

    public boolean alive_check(){
        if (health <= 0) {
            System.out.println(name + " is now at " + health + " health. " + name + " has beem eliminated.");
            return false;
        }
        System.out.println(name + " is now at " + health + " health.");
        return true;
    }
}
