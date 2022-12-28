import animals.Animal;
import animals.Duck;
import animals.Fish;
import animals.Lion;
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

        worker.feed(meat, lion);
        worker.feed(grass, lion);

        Animal[] swimAnimal;
        swimAnimal = createPond();
        for(Animal animal: swimAnimal) {

        }
    }

    public static Animal[] createPond(){
        Animal[] swimAnimal = new Animal[2];
        Fish fish = new Fish();
        Duck duck = new Duck();

        swimAnimal[0] = fish;
        swimAnimal[1] = duck;

        return swimAnimal;
    }
}