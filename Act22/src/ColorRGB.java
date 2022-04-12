

public class ColorRGB {
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

    public void setRed(int red) throws ExcepcionRango {
        if (red >= 0 && red < 256)
            this.Red = red;
        else
            throw new ExcepcionRango(red);
    }

    public void setGreen(int green) throws ExcepcionRango {
        if (green >= 0 && green < 256)
            this.Green = green;
        else
            throw new ExcepcionRango(green);
    }

    public void setBlue(int blue) throws ExcepcionRango {
        if (blue >= 0 && blue < 256)
            this.Blue = blue;
        else
            throw new ExcepcionRango(blue);
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

    public String toHex() {
        String redx = Integer.toHexString(getRed());
        String greenx = Integer.toHexString(getGreen());
        String bluex = Integer.toHexString(getBlue());
        redx.replace("0x", "");
        greenx.replace("0x", "");
        bluex.replace("0x", "");
        if (redx.length() == 1) redx = "0" + redx;
        if (greenx.length() == 1) greenx = "0" + greenx;
        if (bluex.length() == 1) bluex = "0" + bluex;
        return (redx + greenx + bluex).toUpperCase();
    }

    public String toString() {
        return ("Red: " + Red + ", Green: " + Green + ", Blue: " + Blue);
    }

    public ColorRGB clone() {
        return new ColorRGB(Red, Green, Blue);}

    public boolean equals(Object o) throws ExcepcionObjeto{
        if (o instanceof ColorRGB) {
            ColorRGB c = (ColorRGB) o;
            return c.getRed() == this.Red &&
                    c.getGreen() == this.Green &&
                    c.getBlue() == this.Blue;
        } else
            throw new ExcepcionObjeto(o);
    }
}

