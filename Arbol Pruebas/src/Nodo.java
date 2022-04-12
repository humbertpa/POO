public class Nodo {
    int Data;
    Nodo left, right;

    public Nodo(int data) {

        this.Data = data;

    }

    public void insert(int data) {
        if (data <= this.Data) {
            if (left == null) {
                left = new Nodo(data);
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = new Nodo(data);
            } else {
                right.insert(data);
            }
        }
    }

    public Nodo buscadorPadre(int data){
        if(left.Data==data || right.Data==data) {
            return this;
        }
        else if(data<Data){
            return(left.buscadorPadre(data));
        }
        else if(Data<data){
            return(right.buscadorPadre(data));
        }
        return null;
    }

    public Nodo leafMin(){
        if(this.left!=null){
            return(left.leafMin());
        }else{
            return this;
        }
    }

    public Nodo leafMax(){
        if(this.right!=null){
            return(right.leafMax());
        }else{
            return this;
        }
    }

    public void cambioRaiz(int data){
        Nodo temp0=this;
        Nodo temp1=buscadorPadre(data);
        Nodo temp2 = null;
        if(temp1.right!=null && temp1.right.Data==data){
            temp2=temp1.right;
        }
        else if(temp1.left!=null && temp1.left.Data==data){
            temp2=temp1.left;
        }
        Nodo temp3=temp2.left;
        Nodo temp4=temp2.right;

        temp0.left=temp4;
        temp1.right=temp3;
        temp2.left=temp1;
        temp2.right=temp0;

        this.Data= temp2.Data;
        this.left=temp2.left;
        this.right=temp2.right;

        System.out.println("Se cambio la raiz");


    }

    public boolean contains(int data) {
        if (data == this.Data) {
            return true;
        } else if (data < this.Data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(data);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(data);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(this.Data);
        if (right != null) {
            right.printInOrder();
        }
    }
}
