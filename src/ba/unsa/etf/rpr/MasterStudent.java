package ba.unsa.etf.rpr;

public class MasterStudent extends Student {
    private int brojSemestra;

    public MasterStudent(String ime, String prezime, int brojIndeksa, int brojSemestra) {
        super(ime, prezime, brojIndeksa);
        this.brojSemestra = brojSemestra;
    }
    @Override
    public String toString() {
        return null;
    }

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public void setBrojSemestra(int brojSemestra) {
        this.brojSemestra = brojSemestra;
    }
}
