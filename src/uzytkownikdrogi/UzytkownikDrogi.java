package uzytkownikdrogi;

import java.util.Random;
import java.util.*;

/**
 *
 * @author Bercik
 */
abstract class UzytkownikDrogi {

    int predkosc;
    char znak;
    int x;
    int y;

    public abstract int predkosc();

    public static int m = 10;
    public static int n = 90;
    static char[][] mapa = new char[m][n];

    public void zerowanieMapy() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mapa[i][j] = '.';
            }
        }
    }

    int getPredkosc;

    public void Mapa() {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print(mapa[i][j]);
            }
        }
        System.out.println("");
    }

    public void ustawieniePoczatkowe(int a, int b, char c, int d) {
        x = a;
        y = b;
        znak = c;
        predkosc = predkosc * d;
    }

    public void Przesuniecie() {
        Random random = new Random();
        int r = random.nextInt(10) - 3;
        int g = random.nextInt(6) - 3;
        x = x + r;
        y = y + (g + predkosc);
    }

    public void ustawPojazd() {
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        if (x >= m) {
            x = m - 1;
        }
        if (y >= n) {
            y = n - 1;
        }
        if (mapa[x][y] == '.') {
            mapa[x][y] = znak;
        } else {
            System.out.println("KRAKSA");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        UzytkownikDrogi auto1 = new Auto();
        UzytkownikDrogi auto2 = new Auto();
        UzytkownikDrogi pieszy1 = new Pieszy();
        UzytkownikDrogi pieszy2 = new Pieszy();
        UzytkownikDrogi rower1 = new Rower();
        UzytkownikDrogi rower2 = new Rower();
        UzytkownikDrogi mapa1 = new Rower();

        Scanner scanner = new Scanner(System.in);

        auto1.ustawieniePoczatkowe(2, 20, 'a', 2);
        auto2.ustawieniePoczatkowe(3, 40, 'b', 3);
        pieszy1.ustawieniePoczatkowe(4, 30, 'c', 1);
        pieszy2.ustawieniePoczatkowe(6, 60, 'd', 2);
        rower1.ustawieniePoczatkowe(7, 50, 'e', 1);
        rower2.ustawieniePoczatkowe(8, 70, 'f', 2);

        for (;;) {
            mapa1.zerowanieMapy();
            auto1.Przesuniecie();
            auto2.Przesuniecie();
            pieszy1.Przesuniecie();
            pieszy2.Przesuniecie();
            rower1.Przesuniecie();
            rower2.Przesuniecie();
            auto1.ustawPojazd();
            auto2.ustawPojazd();
            pieszy1.ustawPojazd();
            pieszy2.ustawPojazd();
            rower1.ustawPojazd();
            rower2.ustawPojazd();
            mapa1.Mapa();
            System.out.println("Wcisnij enter aby rozpoczac nastepny krok");
            String nastepnyKrok = scanner.nextLine();
        }
    }
}
