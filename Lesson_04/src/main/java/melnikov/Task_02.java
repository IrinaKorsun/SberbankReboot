package melnikov;

public class Task_02 {

    public static void main(String[] args) {
        FiguresFactory red = new RedFigures();
        FiguresFactory green = new GreenFigures();
        Triangle t = red.createTriangle();
        Quad  q =  green.createQuad();
        System.out.printf(t.getFigure());
        System.out.println(q.getFigure());
    }
}
