package Interface;

interface HewanAir {
    void berenang();
}

interface HewanDarat {
    void berjalan();
}

class Katak implements HewanAir, HewanDarat {
    @Override
    public void berenang() {
        System.out.println("Katak berenang di air");
    }

    @Override
    public void berjalan() {
        System.out.println("Katak berjalan di darat");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Katak k = new Katak();
        k.berenang();
        k.berjalan();
    }
}
