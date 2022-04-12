public class Tarea1 {
    public static void main(String[] args) {

        int[] A = {1, 4, 5, 7, 9, 12, 13};
        int X = 13;
        System.out.println(haydif(A, X));
    }
/*
    private static boolean haydif(int[] A,int X) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if(A[i]+A[j]==X)return true;
            }
        }
        return false;
    }
 */
    private static boolean haydif(int[] A,int X) {
        int dif;
        for (int i = 0; i < A.length; i++) {
            dif=X-A[i];
            for (int j = i + 1; j <A.length; j++) {
                if(A[j]==dif)return true;
                if(A[j]>dif)break;
            }
        }
        return false;
    }
}