public class Main {
    public static void main(String[] args){
        mouse1 m1=new mouse1();
        mouse2 m2=new mouse2();

        m1.leftClick();
        m1.rightClick();
        m1.scrollUp();
        m1.scrollDown();
        m1.setColor(m1.texture);

        m2.leftClick();
        m2.rightClick();
        m2.scrollUp();
        m2.scrollDown();
        m2.connect();


    }
}
