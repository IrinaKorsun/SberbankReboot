package melnikov;

public class Circle {
    private StringBuilder builder;

    public void generate(String color)
    {
        builder = new StringBuilder(color);
        builder.append ("   1\n")
                .append("  1 1\n")
                .append(" 1   1\n")
                .append("  1 1\n")
                .append("   1\n")
                .append(Colors.RESET);
    }

    String getFigure() {
        return builder.toString();
    }
}
