abstract class Kendaraan {
    String nama;

    Kendaraan(String nama) {
        this.nama = nama;
    }

    abstract void berjalan(); // method abstract

    void info() { // method biasa
        System.out.println("Nama Kendaraan: " + nama);
    }
}

class Mobil extends Kendaraan {
    Mobil(String nama) {
        super(nama);
    }

    @Override
    void berjalan() {
        System.out.println(nama + " berjalan dengan 4 roda");
    }
}

public class AbstrakTest {
    public static void main(String[] args) {
        Kendaraan m = new Mobil("Avanza");
        m.info();
        m.berjalan();
    }
}
