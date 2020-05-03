package lab2.challenge3;

public class Fish extends Animal implements Pet{

    protected Fish() {

    }


    void walk() {
        System.out.println("I don't walk! I swim!");
    }

    @Override
    void eat() {
        System.out.println("I love seafood");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String setName(String name) {
        return null;
    }

    @Override
    public void play() {

    }
}
