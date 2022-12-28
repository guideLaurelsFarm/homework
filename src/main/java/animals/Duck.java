package animals;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {
    private String voice;
    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String getVoice() {
        return voice;
    }
}
