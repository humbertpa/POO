import java.util.*;


public class TestAct25 {
    public static void main(String[] args) {
        ArrayList<Number> list0 = new ArrayList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        Stack<Date> stck = new Stack<>();
        HashSet<String> hsS = new HashSet<>();
        HashSet<Integer> hsI=new HashSet<>();
        HashSet<Number> hsN=new HashSet<>();
        ArrayDeque<Number> numAQ = new ArrayDeque<>();
        ArrayDeque<Object> obAQ = new ArrayDeque<>();


        hsI.add(5);
        hsI.add(9);
        hsI.add(4);
        hsI.add(5);
        hsI.add(8);
        hsI.add(2);
        hsI.add(7);
        hsI.add(1);

        hsN.add(5);
        hsN.add(9.0);
        hsN.add(4);
        hsN.add(5.7);
        hsN.add(8.5);
        hsN.add(2);
        hsN.add(7);
        hsN.add(1);


//        greatestNumber(hsI);
//        no es válido. se tendría qué crear ótro método que reciba como parametro un HashSet<Integer>
//        algo similar a:
//        private static double greatestNumber(HashSet<Integer> collection) {


        System.out.println(metodos.greatestNumber(hsI));//se tiene que crear un nuevo método
        System.out.println(metodos.greatestNumber(hsN));//sí funciona



            Date fecha1 = new Date(23, 59, 59, 31, 12, 2017);
            Date fecha2 = new Date(0, 26, 3);
            Date fecha3 = new Date();

            stck.push(fecha1);
            stck.push(fecha2);
            stck.push(fecha3);

            hsI.add(1);
            hsI.add(2);
            hsI.add(4);

            hsN.add(10);
            hsN.add(9);
            hsN.add(8);

            System.out.println(metodos.greatestNumber(hsN));

            numAQ.offer(100);
            numAQ.offer(35.5);

            obAQ.offer("Humberto");

            metodos.changeQueue(obAQ, numAQ);

            System.out.println(obAQ);

        }
    }
