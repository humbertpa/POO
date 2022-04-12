import java.util.Scanner;

public class Main<T extends Comparable<T>>{

    private class Nodo{
        Nodo left,right;
        T key;

        Nodo(T llave){
            key=llave;
        }
    }

    Nodo raiz;

    public void insertar(T key){
        Nodo nuevoNodo = new Nodo(key);
        if(raiz == null){
            raiz= nuevoNodo;
        }else{
            Nodo temp = raiz;
            Nodo parent;
            while(true){
                parent = temp;
                if(key.compareTo(temp.key)<0){
                    temp = temp.left;
                    if(temp==null){
                        parent.left = nuevoNodo;
                        return;
                    }
                }else{
                    temp = temp.right;
                    if(temp==null){
                        parent.right=nuevoNodo;
                        return;
                    }
                }
            }
        }
    }

    public void imprimir(Nodo node) {
        if(node!=null){
            System.out.println(node.key);
            imprimir(node.left);
            imprimir(node.right);




        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        Main<String> BibBabel = new Main<>();

        while(casos>=0){
            BibBabel.insertar(sc.nextLine());
            casos--;
        }

        BibBabel.imprimir(BibBabel.raiz);
    }
}