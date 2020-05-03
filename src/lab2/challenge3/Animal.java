package lab2.challenge3;

abstract class Animal {
    protected int legs;


    protected Animal(){

    }

    protected Animal(int legs){
        this.legs = legs;
    }


    abstract void eat();

    void walk(int nrOfLegs){
        System.out.println("I'm walking with the help of " + nrOfLegs + " legs");
    }
}
