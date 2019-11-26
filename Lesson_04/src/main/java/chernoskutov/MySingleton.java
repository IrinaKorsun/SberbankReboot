package chernoskutov;

// Double Checked Locking & volatile
class MySingleton {
    // volatile - делает поле атомарным (использоется в многоточных приложениях,
    // для исключения неопределённость параллелизма)
    // умные люди пишут что возможна ситуация, при которой другой поток может получить доступ к полю instance
    // и начать его использовать (на основании условия, что указатель не нулевой) т.к.
    // не полностью сконструирован объект (Особенности модели памяти Java)
    // https://habr.com/ru/post/129494/
    private static volatile MySingleton instance;

    static MySingleton getInstance() {
        //получаем ссылку на статическое поле класса
        MySingleton localInstance = instance;
        if (localInstance == null) {
            // если ссылка null(обект не был ранее создан), то
            // синхронизация по классу с последующим соданием единст. объекта
            synchronized (MySingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    // + ленивая инициализация
                    instance = localInstance = new MySingleton();
                }
            }
        }
        return localInstance;
    }
}
