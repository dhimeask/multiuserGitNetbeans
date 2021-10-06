import javax.swing.*;
import java.util.Scanner;

public class Tugas03 {
//    Variabel Global
    double m, v;

//    SETTER
    public void setM(double m) {
        this.m = m;
    }

    public void setV(double v) {
        this.v = v;
    }

//    GETTER
    public double getM() {
        return m;
    }

    public double getV() {
        return v;
    }

    //    Function kinetik to count energy kinetic
    private static void kinetik(Tugas03 data){
//        Call Getter and to define in variabel
        double massa = data.getM();
        double kecepatan = data.getV();
        double v2 = Math.pow(kecepatan, 2);
        double hasil = 0.5*massa*v2;
        System.out.println("=========== Rumus ===============");
        System.out.println("Ek = 1/2 x m x v2");
        System.out.println("Diket : ");
        System.out.println("\tMassa Benda\t\t= "+ massa);
        System.out.println("\tKecepatan Benda\t= "+ kecepatan);
        System.out.println("Ek = "+ hasil);
    }

//    MAIN
    public static void main(String[] args) {
//        HEADER

        JOptionPane.showInputDialog("Masukkan Data : ");
        System.out.println("=================================");
        System.out.println("=\tMenghitung Energi Kinetik\t=");
        System.out.println("=================================");

//        INPUT DATA
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Massa(Kg)\t\t: ");
        double m = scanner.nextDouble();
        System.out.print("Masukkan Kecepatan Benda(m/s)\t: ");
        double v = scanner.nextDouble();

//        Call Construktor Setter
        Tugas03 data = new Tugas03();
        data.setM(m);
        data.setV(v);

//        Call function kinetik
        kinetik(data);

//        FOOTER
        System.out.println("=================================");
        System.out.println("=\t\t\tSELESAI\t\t\t\t=");
        System.out.println("=================================");
    }
}
