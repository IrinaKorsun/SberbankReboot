package melnikov;

public class GreenFigures implements FiguresFactory {
    @Override
    public Triangle createTriangle() {
        return new GreenTriangle();
    }

    @Override
    public Quad createQuad() {
        return new GreenQuad();
    }

    @Override
    public Circle createCircle() {
        return new GreenCircle();
    }
}
