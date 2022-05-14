package c_synchronized_accessor;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

/*
    Плюсы:
        * Ленивая инициализация.
        * Потокобезопасность

    Минусы:
        * Низкая производительность в многопоточной среде
*/
