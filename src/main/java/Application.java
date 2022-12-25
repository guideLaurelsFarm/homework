import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        String[] array;
        Kotik secondKotik = new Kotik("Boris", "Meow", 10, 50);

        Kotik kotik = new Kotik();
        kotik.setName("Ne Boris");
        kotik.setSatiety(10);
        kotik.setWeight(20);
        kotik.setVoice("Ne meow");

        array = secondKotik.livaAnotherDay();
        for(String state: array) {
            System.out.println(state);
        }
        kotik.livaAnotherDay();

        System.out.println(compareVoice(kotik, secondKotik));
        System.out.println(secondKotik.getCount());
    }

    public static boolean compareVoice(Kotik catOne, Kotik secondCat) {
        return catOne.getVoice().equals(secondCat.getVoice());
    }
}