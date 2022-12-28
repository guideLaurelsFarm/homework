package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if(food instanceof Meat) {
            setSatiety(food.getEnergy());
        } else System.out.println("it's not meat");
    }
}
