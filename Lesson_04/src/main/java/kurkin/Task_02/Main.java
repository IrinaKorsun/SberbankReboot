package kurkin.Task_02;

public class Main {
    public static void main(String[] args) {
        CookiesFactory factory = new CookiesFactory();
        Cookies appleCookie = factory.getCookies(CookiesTypes.Aplle);
        Cookies chokolateCookie = factory.getCookies(CookiesTypes.Chokolate);
        Cookies shortbreadCookie = factory.getCookies(CookiesTypes.Shortbread);

        appleCookie.getCookieType();
        chokolateCookie.getCookieType();
        shortbreadCookie.getCookieType();
    }
}
