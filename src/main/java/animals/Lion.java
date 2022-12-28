package animals;

public class Lion extends Carnivorous implements Run, Voice {
    private String voice;
    @Override
    public void run() {
        System.out.println("Lion is run");
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
