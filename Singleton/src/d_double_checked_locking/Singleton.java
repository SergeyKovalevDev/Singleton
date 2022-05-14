package d_double_checked_locking;

public class Singleton {
    private volatile static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}

/*
    Плюсы:
        * Ленивая инициализация.
        * Потокобезопасность
        * Высокая производительность в многопоточной среде

    Минусы:
        * Не поддерживается на версиях Java ниже 1.5 (в версии 1.5 исправили работу ключевого слова volatile)

    Для корректной работы данного варианта реализации обязательно одно из двух условий.
    Переменная INSTANCE должна быть либо final, либо volatile.
*/
