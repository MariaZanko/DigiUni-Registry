public class B extends A {

    @Override
    public void process(Object obj) {
        System.out.println("B: override process(Object) -> " + obj);
    }


    public void process(String str) {
        System.out.println("B: overload process(String) -> " + str);
    }
}