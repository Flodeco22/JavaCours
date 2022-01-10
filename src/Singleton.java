import static java.lang.Thread.*;

public final class Singleton {
    private static Singleton instance;
    public int value;

    private Singleton(int value) {
        // The following code emulates slow initialization.
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(int value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        else{
            instance.value++;
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        Singleton single = Singleton.getInstance(1);
        System.out.println(single.value);
        Singleton single2 = Singleton.getInstance(2);
        single2 = Singleton.getInstance(2);
        single2 = Singleton.getInstance(2);
        single2 = Singleton.getInstance(2);
        System.out.println(single2.value);

    }
}
