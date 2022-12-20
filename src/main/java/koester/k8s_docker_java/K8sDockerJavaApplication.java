package koester.k8s_docker_java;


import java.io.FileWriter;
import java.io.IOException;

public class K8sDockerJavaApplication {

    public static void main(String[] args) {
        tuermeVonHanoi();
    }

    public static void tuermeVonHanoi() {
        try (FileWriter fileWriter = new FileWriter("/test-pd/" + System.getenv("HOSTNAME"))) {
        for (int i = 1; i < 64; i++) {
            long start = System.currentTimeMillis();
            int hoehe = i;
            BewegeTurm(hoehe, 1, 3);
            long end = System.currentTimeMillis();
            long time = end - start;
            String s = "Time: fuer hoehe = " + i + " Time = " + time + "\n";
            System.out.println(s);
                fileWriter.write(s);
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static int Hilf(int Start, int Ziel) {
        return (6 - Start - Ziel);
    }

    static void BewegeScheibe(int ScheibenNr, int Start, int Ziel) {
        //System.out.println("Transport Scheibe "+ScheibenNr+" von "+Start+" zu "+Ziel);
    }

    static void BewegeTurm(int Anz, int Start, int Ziel) {
        if (Anz > 0) {
            BewegeTurm(Anz - 1, Start, Hilf(Start, Ziel));
            BewegeScheibe(Anz, Start, Ziel);
            BewegeTurm(Anz - 1, Hilf(Start, Ziel), Ziel);
        }
    }

}
