public class EagerSingletonTest {
    public static void main(String[] args) {
        Singleton eagerSingleton1 = Singleton.getInstance();
        eagerSingleton1.showMessage();

        Singleton eagerSingleton2 = Singleton.getInstance();
        eagerSingleton2.showMessage();

        System.out.println("Both references are the same: " + (eagerSingleton1 == eagerSingleton2));
    }
}
