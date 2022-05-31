package bangunruang;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di matakuliah Pemrograman Berorientasi Objek";
        int tahun = 2022;
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(pesan + " Tahun " + tahun);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //scanner inputanKeyboard
        Scanner keyboard = new Scanner(System.in);
        
        int s = 0;
        System.out.print("Masukkan panjang sisi kubus (cm) = ");
        s = keyboard.nextInt();
        hitungLuasKubus(s);

        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan jari-jari lingkaran (cm) = ");
        lingkaran.r = keyboard.nextInt();
        lingkaran.tampilkanLuasLingkaran();
    }

    //hitung volume kubus => V = s^3
    public static void hitungLuasKubus (int s) {
        double v = 0.0;
    
        v = Math.pow(s,3);

        System.out.println("Menghitung Volume Kubus");
        System.out.println("Panjang sisi = " + s + " cm");
        System.out.println("Volume kubus (s*s*s) = " + v + " cm^3");

    }

    //Luas lingkaran => A = phi * r^2

}

