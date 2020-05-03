package lab2.challenge3;

public class TestAnimals {

    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Kitty");
        Animal a  = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        Spider sp = new Spider();

        d.walk();
        c.play();
        c.eat();
        a.eat();

        p = (Cat) c;
        System.out.println(p.getName());

        e.walk(8);
        sp.walk(8);
        p.play();
        c.eat();




    }
}
