package lab4.Decorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage){
        super("White whip", 1, beverage);
    }
}
