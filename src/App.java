public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di matakuliah Pemrograman Berorientasi Objek";
        int tahun = 2022;
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(pesan + " Tahun " + tahun);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        hitungLuasKubus();
    }

    //hitung volume kubus => V = s^3
    public static void hitungLuasKubus () {
        int v = 0;
        int s = 10; //dlm cm

        v = s*s*s;

        System.out.println("Menghitung Volume Kubus");
        System.out.println("Panjang sisi = " + s + " cm");
        System.out.println("Volume kubus (s*s*s) = " + v + " cm^3");

    }
}

