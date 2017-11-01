package uzytkownikdrogi;

/**
 *
 * @author Bercik
 */
public class Auto extends UzytkownikDrogi {

    public int Auto() {
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
