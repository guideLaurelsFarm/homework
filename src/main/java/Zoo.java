import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setVoice("Rrrrrrrrr");

        Worker worker = new Worker();

        Meat meat = new Meat();
        Grass grass = new Grass();

        worker.feed(lion, meat);
        worker.feed(lion, grass);

        worker.getVoice(lion);

        Swim[] swimAnimal;
        swimAnimal = createPond();
        for(Swim animal: swimAnimal) {
            animal.swim();
        }
    }

    public static Swim[] createPond(){
        Swim[] swimAnimal = new Swim[2];
        Fish fish = new Fish();
        Duck duck = new Duck();

        swimAnimal[0] = fish;
        swimAnimal[1] = duck;

        return swimAnimal;
    }
}