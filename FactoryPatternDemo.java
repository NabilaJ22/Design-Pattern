package factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.createPizza("cheese");
        pizza.prepare();
        simplePizzaFactory.createPizza("pepperoni").prepare();
    }
}

interface Pizza{
    void prepare();
}

class CheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Cheese Pizza Prepared");
    }
}

class PepperoniPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Pepperoni Pizza Prepared");

    }
}

class VeggiePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Veggie Pizza Prepared");
    }
}

class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}