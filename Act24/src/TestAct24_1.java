import java.util.ArrayList;
import java.util.List;

public class TestAct24_1 extends metodos{
    public static void main(String[] args){
        List<String>list=new ArrayList<>();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        list.add("cuatro");
        list.add("cinco");
        list.add("seis");

        print(list);

        System.out.println("Cambio entre dos y cuatro");

        for(int i=0;i<list.size();i++){
            if(list.get(i)=="dos") {
                list.set(i, "cuatro");
                i++;
            }
            if(list.get(i)=="cuatro") {
                list.set(i, "dos");
            }
        }

        print(list);

        System.out.println("Posiciones de dos y cuatro");

        for(int i=0;i<list.size();i++){
            if(list.get(i)=="dos" || list.get(i)=="cuatro"){
                System.out.printf("%2d) %s\n", i, list.get(i));
            }
        }

        System.out.println("Strings a mayusculas");

        for(int i=0;i<list.size();i++){

            list.set(i,list.get(i).toUpperCase());
        }

        print(list);

        while(list.iterator().hasNext()){
            System.out.println(list.get(0));
            list.remove(0);
        }

        print(list);
    }
}
