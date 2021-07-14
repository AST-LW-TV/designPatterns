package leftoutpatterns;

public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;
    String sampleString;

    private SingletonPattern() {
        sampleString = "hello world";
    }

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
            System.out.println("Inside...");
        }
        return singletonPattern;
    }
}

class Main {
    public static void main(String[] args) {
        SingletonPattern object = SingletonPattern.getInstance();
        System.out.println(object.sampleString);
        SingletonPattern object1 = SingletonPattern.getInstance();
        System.out.println(object1.sampleString);
        object1.sampleString = "hello world, how are you?";
        System.out.println(object.sampleString);
        System.out.println(object1.sampleString);
    }
}