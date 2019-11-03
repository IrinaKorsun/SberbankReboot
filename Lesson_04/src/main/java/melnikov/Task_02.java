package melnikov;

public class Task_02 {

    public static void main(String[] args) {
        Figures red = new RedFigures();
        Figures green = new GreenFigures();
        Triangle t = red.createTriangle();
        Quad  q =  green.createQuad();
        System.out.printf(t.getFigure());
        System.out.println(q.getFigure());
    }
}
