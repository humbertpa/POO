import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Queue;

abstract class metodos {

    public static <T> int frequency(Collection<T> collection, T object){
        int i=0;
        for(T ob:collection){
            if(object==ob) i++;
        }
        return i;
    }

    public static double greatestNumber(Collection<Number> collection) {
        Number G = null;
        for(Number N : collection)
            if(G == null || N.doubleValue() > G.doubleValue()) G = N;
        return G.doubleValue();
    }

    static double greatestNumber(HashSet<Integer> collection){
        Number G = null;
        for(Number N : collection)
            if(G == null || N.doubleValue() > G.doubleValue()) G = N;
        assert G != null;
        return G.doubleValue();
    }

    public static void changeQueue(Queue<? super Object> dest, Queue<Number> src){
        for(Number num:src){
            dest.offer(num);
        }
    }
}
