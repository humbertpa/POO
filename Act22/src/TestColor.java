
public class TestColor {
    public static void main(String[] args) throws ExcepcionRango {

        ColorRGB color = new ColorRGB(255, 255, 255);
        ColorRGB gris = new ColorRGB(17);
        String x="16";
        System.out.println(color);
        System.out.println(color.toHex());

        System.out.println(color.equals(gris));
        System.out.println(color.equals(x));

    }
}
