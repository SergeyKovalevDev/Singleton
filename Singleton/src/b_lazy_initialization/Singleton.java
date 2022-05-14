package b_lazy_initialization;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

/*
    Плюсы:
        * Ленивая инициализация.

    Минусы:
        * Не потокобезопасно
*/
