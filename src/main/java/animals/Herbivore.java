package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if(food instanceof Grass) {
           setSatiety(food.getEnergy());
        } else System.out.println("it's not grass");
    }
}
