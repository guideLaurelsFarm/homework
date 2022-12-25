package animals;

import lombok.*;

import java.util.Scanner;

@Setter
@Getter
public class Kotik {
   Scanner scanner = new Scanner(System.in);

   private String name, voice;
   private int satiety, weight;
   private static int count;
   private final int METHODS = 5;

    public Kotik() {
        count++;
    }
    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;

        count++;
    }

    public int getCount() {return count;}

    boolean play() {
        if(satiety > 0) {
            satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    boolean sleep() {
        if(satiety > 0) {
            satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    boolean wash() {
        if(satiety > 0) {
            satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    boolean walk() {
        if(satiety > 0) {
            satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    boolean hunt() {
        if(satiety > 0) {
            satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    void eat(int eat) {
        satiety = eat;
    }

    void eat(int eat, String food){
        satiety = eat;
        String fd = food;
    }

    void eat() {
        eat(10, "Fish");
    }

    public String[] livaAnotherDay() {
        String[] array = new String[24];

        for(int i = 0; i < 24; i++) {
            switch (random()) {
                case (0):{
                    if (play()) array[i] = "Cat play";
                    eat(1);
                }
                case (1): {
                    if (sleep()) array[i] = "Cat sleep";
                    eat(2, "Meat");
                }
                case (2): {
                    if (wash()) array[i] = "Cat wash";
                    eat();
                }
                case (3): {
                    if (walk()) array[i] = "Cat walk";
                    eat(4, "Fish");
                }
                case (4): {
                    if (hunt()) array[i] = "Cat hunt";
                    eat(5);
                }
            }
        }
        return array;
    }

    int random() {return (int) (Math.random() * METHODS);}
}
