public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
        System.out.println("Singleton instance created (Lazy Initialization)");
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Lazy Singleton: Hello, I am the only instance!");
    }
}
