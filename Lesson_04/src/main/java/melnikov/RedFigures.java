package melnikov;

public class RedFigures implements FiguresFactory {
    @Override
    public Triangle createTriangle() {
        return new RedTriangle();
    }

    @Override
    public Quad createQuad() {
        return new ReaQuad();
    }

    @Override
    public Circle createCircle() {
        return new RedCircle();
    }
}
