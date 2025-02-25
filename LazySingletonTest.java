public class LazySingletonTest {
    public static void main(String[] args) {
        Singleton lazySingleton1 = Singleton.getInstance();
        lazySingleton1.showMessage();

        Singleton lazySingleton2 = Singleton.getInstance();
        lazySingleton2.showMessage();

        System.out.println("Both references are the same: " + (lazySingleton1 == lazySingleton2));
    }
}
