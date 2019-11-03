package melnikov;

public class RedFigures implements Figures {
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
