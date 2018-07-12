package _06;

public class If_To_When {

    enum Color {
        GREEN,
        BLUE,
        RED,
        YELLOw
    }

    public static void main(String... args) {
        Color myColor = Color.GREEN;

        String colorText = null;

        switch (myColor) {
            case GREEN:
                colorText = "green";
                break;
            case BLUE:
                colorText = "blue";
                break;
            case RED:
                colorText = "red";
                break;
            case YELLOw:
                colorText = "yellow";
                break;
        }

        System.out.println(colorText);
    }
}
