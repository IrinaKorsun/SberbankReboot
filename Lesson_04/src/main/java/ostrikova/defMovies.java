package ostrikova;

public class defMovies {
    public interface Movies {
        void watch();
    }

    public class horror implements Movies {
        @Override
        public void watch() {
            System.out.println("Вы смотрите horor фильм");
        }
    }

    public class science implements Movies {
        @Override
        public void watch() {
            System.out.println("Вы смотрите science фильм");
        }
    }

    public class romantic implements Movies {
        @Override
        public void watch() {
            System.out.println("Вы смотрите romantic фильм");
        }
    }

    public enum moviesTypes {
        HORROR,
        SCIENCE,
        ROMANTIC,
    }

    public Movies getMovies(moviesTypes type) {
        Movies toReturn = null;
        switch (type) {
            case HORROR:
                toReturn = new horror();
                break;
            case SCIENCE:
                toReturn = new science();
                break;
            case ROMANTIC:
                toReturn = new romantic();
                break;
            default:
                throw new IllegalArgumentException("Не верный жанр:" + type);
        }
        return toReturn;
    }

    public static class Main {
        public static void main(String[] args) {
            defMovies factory = new defMovies();

            Movies horror = factory.getMovies(moviesTypes.HORROR);
            Movies science = factory.getMovies(moviesTypes.SCIENCE);
            Movies romantic = factory.getMovies(moviesTypes.ROMANTIC);

            horror.watch();
            science.watch();
            romantic.watch();
        }

    }
