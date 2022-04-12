public class Pruebas {
    public static void main(String[] args) {

        Nodo arbol=new Nodo(24);
        arbol.insert(15);
        arbol.insert(9);
        arbol.insert(32);
        arbol.insert(22);
        arbol.insert(41);
        arbol.insert(14);
        arbol.insert(11);
        arbol.insert(10);
        arbol.insert(19);
        arbol.insert(20);
        arbol.insert(16);
        arbol.insert(13);
        arbol.insert(25);
        arbol.insert(29);
        arbol.insert(28);
        arbol.insert(31);

        arbol.printInOrder();
        System.out.println("________________________________________________");
        arbol.cambioRaiz(19);
        arbol.printInOrder();

    }
}
