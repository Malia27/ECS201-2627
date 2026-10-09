import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza, 300, 300);

        Topping topping1 = new Topping("Pepperoni");
        addObject(topping1, 100, 50);

        Topping topping2 = new Topping("Mushrooms");
        addObject(topping2, 250, 100);

        Topping topping3 = new Topping("Olives");
        addObject(topping3, 400, 20);

        Topping topping4 = new Topping("Pineapples");
        addObject(topping4, 520, 80);
    }
}