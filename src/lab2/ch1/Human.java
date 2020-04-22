package lab2.ch1;

public class Human {
    private int health;
    private String name;

    public Human(int health, String name){
        this.health = health;
        this.name = name;
    }

    public int getHealth(){
        return health;
    }

    public String getName(){
        return name;
    }

    public void decreaseHealth(int damage){
        health = health - damage;
    }
}
