import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

abstract class toArray {

    public static String[][] toArray(File archivo) throws FileNotFoundException {
        Scanner lector = new Scanner(archivo);
        String[][] strs = new String[2][120];
        int i = 0;
        while (lector.hasNextLine()) {
            String data = lector.nextLine();
            String[] valores = data.split(",");
            strs[0][i] = valores[0];
            strs[1][i] = valores[1];
            i++;
        }
        lector.close();
        return strs;
    }


    public static String[][] asign(String[][] notas, String[][] song) {
        String[][] score = new String[3][120];

        for (int i = 0; i < song[0].length; i++) {
            score[0][i] = song[0][i];
            score[1][i] = song[1][i];
            for (int j = 0; j < notas[0].length; j++) {
                if (Objects.equals(song[0][i], notas[0][j])) {
                    score[2][i] = notas[1][j];
                    break;
                }
            }
        }
        return score;
    }


    public static void toString(String[][] array) {

        for (int i = 0; i < array[0].length; i++) {
            if (array[0][i] == null) break;
            System.out.format("%7s ", array[0][i]);
        }
        System.out.println();
        for (int i = 0; i < array[0].length; i++) {
            if (array[1][i] == null) break;
            System.out.format("%7s ", array[1][i]);
        }
        System.out.println();
        if (array.length > 2) {
            for (int i = 0; i < array[0].length; i++) {
                if (array[1][i] == null) break;
                System.out.format("%7s ", array[2][i]);
            }
        }
    }
}
