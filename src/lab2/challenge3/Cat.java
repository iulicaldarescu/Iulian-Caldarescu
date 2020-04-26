package lab2.challenge3;

public class Cat extends Animal implements Pet {
    String name;


    public Cat(String name){
        super(4);
        this.name = name;
    }


    public Cat(){
        this("");
    }

    //from pet
    @Override
    public String getName() {
        return name;
    }
    //from pet
    @Override
    public String setName(String name) {
        return null;
    }
    //from pet
    @Override
    public void play() {
        System.out.println("I love running after mices");
    }

    @Override
    void eat() {
        System.out.println("I love cheese");
    }
}
