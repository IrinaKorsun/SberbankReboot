package kurkin.Task_02;

public class CookiesFactory {
    public Cookies getCookies(CookiesTypes type) {
        Cookies retCookies;
        switch (type) {
            case Aplle:
                retCookies = new AplleCookies();
                break;
            case Chokolate:
                retCookies = new ChokolateCookies();
                break;
            case Shortbread:
                retCookies = new ShortbreadCookies();
                break;
            default:
                throw new IllegalArgumentException("Такие печеньки пока не производятся - оставьте завяку на сайте");
        }
        return retCookies;
    }
}
