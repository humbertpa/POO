import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class LectorArchivos extends toArray {
    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("src/frecuencias.csv");//se genera objeto tipo File
        File cancion = new File("src/sunnyday.csv");
        String[][] notas;
        String[][] song;
        String[][] score;


        notas=toArray(archivo);
        song=toArray(cancion);
        score=asign(notas,song);

        toArray.toString(notas);
        System.out.println();
        toArray.toString(song);
        System.out.println();
        toArray.toString(score);



    }
}