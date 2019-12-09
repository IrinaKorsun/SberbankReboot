package melnikov;

public class Triangle {
    private StringBuilder builder;

    public void generate(String color)
    {
        builder = new StringBuilder(color);
        builder.append ("   1\n")
                .append("  111\n")
                .append(" 1   1\n")
                .append("1111111\n")
                .append(Colors.RESET);
    }

    String getFigure() {
        return builder.toString();
    }
}
