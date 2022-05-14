package e_class_holder_singleton;

public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}

/*
    Плюсы:
        * Ленивая инициализация.
        * Потокобезопасность.
        * Высокая производительность в многопоточной среде.

    Минусы:
        * Для корректной работы необходима гарантия, что объект класса Singleton инициализируется без ошибок.
          Иначе первый вызов метода getInstance закончится ошибкой ExceptionInInitializerError,
          а все последующие NoClassDefFoundError.
*/
