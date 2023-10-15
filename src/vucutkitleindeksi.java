import java.util.Scanner;

public class vucutkitleindeksi {
    public static void main(String[] args) {

        double kilo, boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu (kg cinsinden)  giriniz : ");
        kilo = inp.nextDouble();

        // Vücut Kitle İndeksi hesaplama
        double vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi: " + vucutKitleIndeksi);
    }
}
