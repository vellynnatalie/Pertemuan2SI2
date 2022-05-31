public class Lingkaran {
    //atribut
    public final float PI = 22.0f/7;
    public int r = 10;
    public float luas = 0;
    //Luas lingkaran => A = pi * r^2

    //method hitung luas lingkaran
    public void hitungLuasLingkaran(){
        luas = PI * r * r;
    }

    //menampilkan luas lingkaran
    public void tampilkanLuasLingkaran(){
        hitungLuasLingkaran();
        System.out.println("Luas Lingkaran (jari-jari : " + r + "cm) = " + luas + "cm2");
    }
}
