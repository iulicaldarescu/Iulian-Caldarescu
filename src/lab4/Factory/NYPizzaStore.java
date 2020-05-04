package lab4.Factory;

public class NYPizzaStore extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("Spicy")){
            pizza = new NYSpicyPizza();
        }else
            if(type.equals("Cheese")){
                pizza = new NYCheesePizza();
        }
        return pizza;
    }
}
//creati chicago pizza