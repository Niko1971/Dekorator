package uzytkownikdrogi;

/**
 *
 * @author Bercik
 */
class Rower extends UzytkownikDrogi {

    public int Rower() {
        return predkosc;
    }

    void setPredkosc() {
        predkosc = 2;
    }

    @Override
    public int predkosc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
