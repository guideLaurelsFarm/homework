package animals;

public class Kotik extends Carnivorous implements Run, Voice{

   private String name, voice;
   private int weight;
   private static int count;
   private static final int METHODS = 5;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.weight = weight;

        count++;
    }

    public static int getCount() {return count;}

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(int satiety) {
        this.setSatiety(satiety);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    boolean play() {
        if(getSatiety() > 0) {
            //satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    boolean sleep() {
        if(getSatiety() > 0) {
            //satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    boolean wash() {
        if(getSatiety() > 0) {
            //satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    boolean walk() {
        if(getSatiety() > 0) {
            //satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    boolean hunt() {
        if(getSatiety() > 0) {
            //satiety--;
            return true;
        }
        System.out.println("Need food");
        return false;
    }

    void eat(int eat) {
        setSatiety(eat);
    }

    void eat(int eat, String food){
        setSatiety(eat);
        String fd = food;
    }

    void eat() {
        eat(10, "Fish");
    }

    public String[] liveAnotherDay() {
        String[] array = new String[24];

        for(int i = 0; i < 24; i++) {
            switch (random()) {
                case (0):{
                    if (play()) array[i] = i + " - Cat play";
                    eat(1);
                }
                case (1): {
                    if (sleep()) array[i] = i + " - Cat sleep";
                    eat(2, "Meat");
                }
                case (2): {
                    if (wash()) array[i] = i + " - Cat wash";
                    eat();
                }
                case (3): {
                    if (walk()) array[i] =  i + " - Cat walk";
                    eat(4, "Fish");
                }
                case (4): {
                    if (hunt()) array[i] = i + " - Cat hunt";
                    eat(5);
                }
            }
        }
        return array;
    }

    int random() {return (int) (Math.random() * METHODS);}

    @Override
    public void run() {

    }
}
