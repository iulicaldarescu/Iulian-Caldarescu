package lab4.Decorator;

import javax.accessibility.AccessibleValue;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(String description, int cost, Beverage beverage){
        super(description,cost);
        this.beverage = beverage;
    }

    public int getCost(){
        return super.getCost() + beverage.getCost();
    }

    public String getDescription(){
        return super.getDescription() + ", " +  beverage.getDescription();
    }
}
