import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.Math;

abstract class GeneradorOnda {
    protected static final int SAMPLE_RATE = 16 * 1024;
    private static double c4 = 261.63;
    private static double ratio = 1.059464062;
    private static int c = 0;
    private static int d = 2;
    private static int e = 4;
    private static int f = 5;
    private static int g = 7;
    private static int a = 9;
    private static int b = 11;
    private static int tempo = 800;

    private static String[][] arreglos = {{"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"},
            {"C7", "C#7", "D7", "D#7", "E7", "F7", "F#7", "G7", "G#7", "A7", "A#7", "B7"},
            {"CMaj7", "C#Maj7", "DMaj7", "D#Maj7", "EMaj7", "FMaj7", "F#Maj7", "GMaj7", "G#Maj7", "AMaj7", "A#Maj7", "BMaj7"},
            {"Cm", "C#m", "Dm", "D#m", "Em", "Fm", "F#m", "Gm", "G#m", "Am", "A#m", "Bm"},
            {"Cm7", "C#m7", "Dm7", "D#m7", "Em7", "Fm7", "F#m7", "Gm7", "G#m7", "Am7", "A#m7", "Bm7"},
            {"CmMaj7", "C#mMaj7", "DmMaj7", "D#mMaj7", "EmMaj7", "FmMaj7", "F#mMaj7", "GmMaj7", "G#mMaj7", "AmMaj7", "A#mMaj7", "BmMaj7"},};

    private static SourceDataLine line;

    static {
        try {
            line = AudioSystem.getSourceDataLine(new AudioFormat(SAMPLE_RATE, 8, 1, true, true));
            line.open(new AudioFormat(SAMPLE_RATE, 8, 1, true, true),SAMPLE_RATE);
        } catch (LineUnavailableException lineUnavailableException) {
            lineUnavailableException.printStackTrace();
        }
        line.start();
    }


    public static JButton[][] botones() {

        ActionListener oyenteAccion = actionEvent -> {
            try {
                reproductor(actionEvent.getActionCommand());
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
        };

        JButton[][] botones = new JButton[arreglos.length][arreglos[0].length];
        for (int j = 0; j < arreglos.length; j++) {
            for (int i = 0; i < arreglos[0].length; i++) {
                botones[j][i] = new JButton(arreglos[j][i]);
                botones[j][i].addActionListener(oyenteAccion);
            }
        }
        return botones;
    }

    public static JPanel panel() {
        JPanel p = new JPanel(new GridLayout(arreglos.length, arreglos[0].length));
        JButton[][] botones = botones();
        for (int j = 0; j < arreglos.length; j++) {
            for (int i = 0; i < arreglos[0].length; i++) {
                p.add(botones[j][i]);
            }
        }
        return p;
    }

    public static JFrame frame() {
        JFrame f = new JFrame("Omnichord");
        f.setVisible(true);
        f.setSize(800, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel());
        return f;
    }

    public static double[] freqs(String chord) {
        int[] notas;
        if (chord.indexOf('7') != -1) {
            if (chord.contains("Maj")) {
                notas = new int[]{0, 0, 7, 11};
            } else {
                notas = new int[]{0, 0, 7, 10};
            }
        } else {
            notas = new int[]{0, 0, 7};
        }

        double[] acordes = new double[notas.length];

        if (chord.indexOf('m') != -1) {
            notas[1] = 3;
        } else {
            notas[1] = 4;
        }

        if (chord.indexOf('D') != -1) {
            for (int i = 0; i < notas.length; i++)
                notas[i] += d;
        }

        if (chord.indexOf('E') != -1) {
            for (int i = 0; i < notas.length; i++)
                notas[i] += e;
        }

        if (chord.indexOf('F') != -1) {
            for (int i = 0; i < notas.length; i++)
                notas[i] += f;
        }

        if (chord.indexOf('G') != -1) {
            for (int i = 0; i < notas.length; i++)
                notas[i] += g;
        }

        if (chord.indexOf('A') != -1) {
            for (int i = 0; i < notas.length; i++)
                notas[i] += a;
        }

        if (chord.indexOf('B') != -1) {
            for (int i = 0; i < notas.length; i++)
                notas[i] += b;
        }

        if (chord.indexOf('#') != -1) {
            for (int i = 0; i < notas.length; i++)
                notas[i] += 1;
        }
        //////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < notas.length; i++) {
            notas[i] = notas[i] % 12;
        }
        /////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < acordes.length; i++) {
            acordes[i] = c4 * Math.pow(ratio, notas[i]);
        }
        return acordes;
    }

    public static byte[] acorde(double[] fs, int ms) {
        int samples = (ms * SAMPLE_RATE) / 1000;
        byte[] output = new byte[samples];
        double[] angles = new double[fs.length];
        for (int i = 0; i < output.length; i++) {
            double prom = 0;
            for (int j = 0; j < fs.length; j++) {
                angles[j] = 2.0 * Math.PI * i * fs[j] / SAMPLE_RATE;
            }
            for (int k = 0; k < angles.length; k++) {
                prom += Math.sin(angles[k]);
            }
            prom = prom / (float) (angles.length);
            output[i] = (byte) (prom * 127f);
        }
        return output;
    }

    public static void reproductor(String chord) throws LineUnavailableException {

        double[] acordes = freqs(chord);

        byte[] toneBuffer = acorde(acordes, tempo);
        line.write(toneBuffer, 0, toneBuffer.length);

//        line.drain();
//        line.close();
    }
}