package animals;

import food.Food;

public abstract class Animal {
    public int satiety;

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public abstract void eat(Food food);

}
