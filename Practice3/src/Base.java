class BaseInit {
    static {
        System.out.println("Статичний блок BaseInit");
    }

    {
        System.out.println("Instance-блок BaseInit");
    }

    BaseInit() {
        System.out.println("Конструктор BaseInit");
    }
}

class ChildInit extends BaseInit {
    static {
        System.out.println("Статичний блок ChildInit");
    }

    {
        System.out.println("Instance-блок ChildInit");
    }

    ChildInit() {
        System.out.println("Конструктор ChildInit");
    }
}

public class Base {
    public void run() {
        System.out.println("Виконується: new ChildInit() ");
        new ChildInit();
    }

    public static void main(String[] args) {
        new Base ().run();
    }
}