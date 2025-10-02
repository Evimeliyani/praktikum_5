class Perkalian {
    // Overloading 1: dua parameter
    int kali(int a, int b) {
        return a * b;
    }

    // Overloading 2: tiga parameter
    int kali(int a, int b, int c) {
        return a * b * c;
    }
}

public class OverloadingTest {
    public static void main(String[] args) {
        Perkalian pk = new Perkalian();
        System.out.println("2 x 3 = " + pk.kali(2, 3));
        System.out.println("2 x 3 x 4 = " + pk.kali(2, 3, 4));
    }
}
