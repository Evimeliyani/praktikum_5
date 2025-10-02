public class OverridingTest {

    // Kelas induk (Super Class)
    static class Hewan {
        void suara() {
            System.out.println("Hewan mengeluarkan suara");
        }
    }

    // Kelas anak 1 (Subclass)
    static class Kucing extends Hewan {
        @Override
        void suara() {
            System.out.println("Kucing mengeong: Meong!");
        }
    }

    // Kelas anak 2 (Subclass)
    static class Anjing extends Hewan {
        @Override
        void suara() {
            System.out.println("Anjing menggonggong: Guk guk!");
        }
    }

    // Method main
    public static void main(String[] args) {
        Hewan h1 = new Hewan();
        Hewan h2 = new Kucing();
        Hewan h3 = new Anjing();

        h1.suara();
        h2.suara();
        h3.suara();
    }
}
