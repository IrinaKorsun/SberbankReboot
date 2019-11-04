package kasyanov;

public final class Singleton {

        private static Singleton instance;
        public String value;

        private Singleton(String value) {
            // Этот код эмулирует медленную инициализацию.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            this.value = value;
        }

        public static Singleton getInstance(String value) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }

    public static void main(String[] args) {
                    System.out.println("Если вы видите то же значение, то синглтон был повторно использован (yay!)" + "\n" +
                    "Если вы видите разные значения, то были созданы 2 синглтона (booo!!)" + "\n\n" +
                    "RESULT:" + "\n");
            Singleton singleton = Singleton.getInstance("FOO");
            Singleton anotherSingleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
            System.out.println(anotherSingleton.value);

    }
}

