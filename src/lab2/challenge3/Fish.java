package lab2.challenge3;

public class Fish extends Animal{

    protected Fish() {
        super(0);
    }


    void walk() {
        System.out.println("I don't walk! I swim!");
    }

    @Override
    void eat() {
        System.out.println("I love seafood");
    }
}
