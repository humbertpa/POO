public class ColorRGB implements Comparable<ColorRGB>{
    private int Red = 0;
    private int Green = 0;
    private int Blue = 0;

    public ColorRGB() {
    }

    public ColorRGB(int color) {
        setRed(color);
        setGreen(color);
        setBlue(color);
    }

    public ColorRGB(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public void setRed(int red) {
        if (red >= 0 && red < 256)
            this.Red = red;
    }

    public void setGreen(int green) {
        if (green >= 0 && green < 256)
            this.Green = green;
    }

    public void setBlue(int blue) {
        if (blue >= 0 && blue < 256)
            this.Blue = blue;
    }

    public int getBlue() {
        return Blue;
    }

    public int getGreen() {
        return Green;
    }

    public int getRed() {
        return Red;
    }

    public String toString() {
        return ("Red: " + Red + ", Green: " + Green + ", Blue: " + Blue);
    }

    public ColorRGB clone() {
        return new ColorRGB(Red, Green, Blue);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorRGB)) return false;
        ColorRGB colorRGB = (ColorRGB) o;
        return Red == colorRGB.Red &&
                Green == colorRGB.Green &&
                Blue == colorRGB.Blue;
    }

    public int compareTo(ColorRGB color) {
        return Integer.compare(getRed(), color.getRed());
    }
}

