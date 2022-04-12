import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestAct24_2{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(100);
        list.add(150);
        list.add(120);
        list.add(100);
        list.add(180);
        list.add(200);
        list.add(120);
        list.add(180);
        list.add(100);

        System.out.println("Tamaño de lista: "+list.size()+"\n");

        list.forEach((s) -> System.out.println(s));

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"uno");
        hm.put(2,"dos");
        hm.put(3,"tres");
        hm.put(4,"cuatro");
        hm.put(5,"cinco");
        hm.put(6,"seis");
        hm.put(7,"siete");

        System.out.println(hm.get(3));
        System.out.println(hm.get(7));






    }
}
