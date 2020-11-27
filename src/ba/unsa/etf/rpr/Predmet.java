package ba.unsa.etf.rpr;

import java.util.List;

public class Predmet {
    private String nazivPredmeta;
    private int brojEctsBodova;
    private List<Student> studenti;
    private boolean daLiJeIzborni;

    public boolean isDaLiJeIzborni() {
        return daLiJeIzborni;
    }

    public void setDaLiJeIzborni(boolean daLiJeIzborni) {
        this.daLiJeIzborni = daLiJeIzborni;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getBrojEctsBodova() {
        return brojEctsBodova;
    }

    public void setBrojEctsBodova(int brojEctsBodova) {
        this.brojEctsBodova = brojEctsBodova;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }
    public void dodajStudnta(Student s){

    }
    public void izbaciStudenta(Student s){

    }
}
