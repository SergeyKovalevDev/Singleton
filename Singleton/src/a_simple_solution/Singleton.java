package a_simple_solution;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

/*
    Самая простая реализация.

    Плюсы:
        * Простота и прозрачность кода
        * Потокобезопасность
        * Высокая производительность в многопоточной среде

    Минусы:
        * Не ленивая инициализация.
*/
