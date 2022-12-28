package employee;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    public void feed(Food food, Animal animal) {
        animal.eat(food);
    }

    public void getVoice(Animal animal) {
        ((Voice) animal).getVoice();
    }
}
