public class Main1 {
    public static void main(String[] args) {

        Animal1 a = new Dog1();
        Animal1 b = new Cat1();


        if (a instanceof Dog1) {

            Dog1 d = (Dog1) a;
            d.fetchStick();
        }


        if (b instanceof Cat1 c) {
            System.out.println("This is a cat (Cat1), no stick fetching here.");
        }


    }
}