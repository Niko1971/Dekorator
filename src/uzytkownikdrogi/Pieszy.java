package uzytkownikdrogi;

/**
 *
 * @author Bercik
 */
public class Pieszy extends UzytkownikDrogi {

    public int Pieszy() {
        return predkosc;
    }

    void setPredkosc() {
        predkosc = 4;
    }

    @Override
    public int predkosc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
